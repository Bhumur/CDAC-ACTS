package com.bhumur.Ticket.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bhumur.Ticket.dto.TicketDTO;
import com.bhumur.Ticket.entity.Ticket;
import com.bhumur.Ticket.entity.enums.Status;
import com.bhumur.Ticket.exception.NoTicketFoundException;
import com.bhumur.Ticket.repo.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	TicketRepo ticketRepo;

	@Override
	public ResponseEntity<String> addTicket(Ticket ticket) {
		deleteOlderTickets();
		Date date = new Date(System.currentTimeMillis());
		ticket.setCreatedate(date);
		try {
			ticketRepo.save(ticket);
		} catch (Exception e) {
			return new ResponseEntity<String>("Phone Number Should be Unique", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Ticket Is Created", HttpStatus.OK);
	}

	@Override
	public TicketDTO updateTicket(Ticket ticket) {
		deleteOlderTickets();
		if(ticket.getStatus().equals(Status.valueOf("RESOLVED"))) {
			Date date = new Date(System.currentTimeMillis());
			ticket.setResolutiondate(date);
			Optional<Ticket> optional;
			if(ticket.getId()==0){
				optional = ticketRepo.findByPhonenumber(ticket.getPhonenumber());
			}else {
				optional = ticketRepo.findById(ticket.getId());
			}
			
			if(optional.isEmpty()) {
				throw new NoTicketFoundException("No Ticket Found with this ID/PhoneNumber");
			}
			else {
				Ticket x = optional.get();
				ticket.setId(x.getId());
				ticket.setPhonenumber(x.getPhonenumber());
				ticket.setCreatedate(x.getCreatedate());
				ticket.setCategory(x.getCategory());
				ticket.setIssuedetails(x.getIssuedetails());
				Ticket t = ticketRepo.save(ticket);
				TicketDTO returnTicket = new TicketDTO();
				BeanUtils.copyProperties(t, returnTicket);
				return returnTicket;
			}
		}
		return null;
	}

	@Override
	public Iterator<TicketDTO> allOpenTickets() {
		deleteOlderTickets();
		Iterator<Ticket> itr = ticketRepo.findAllByStatus(Status.valueOf("OPEN")).iterator();
		ArrayList<TicketDTO> resultList = new ArrayList<TicketDTO>();
		while(itr.hasNext()) {
			Ticket t = itr.next();
			TicketDTO result = new TicketDTO();
			BeanUtils.copyProperties(t, result);
			resultList.add(result);
		}
		return resultList.iterator();
	}

	@Override
	public TicketDTO getTicketById(int ticketId) {
		deleteOlderTickets();
		Optional<Ticket> optional = ticketRepo.findById(ticketId);
		if(optional.isEmpty()) {
			throw new NoTicketFoundException("No Ticket Found With this Details");
		}
		Ticket t = optional.get();
		TicketDTO returnTicket = new TicketDTO();
		BeanUtils.copyProperties(t, returnTicket);
		return returnTicket;
	}

	@Override
	public void deleteOlderTickets() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date oldDate = new Date(currentDate.getYear()-2,currentDate.getMonth(),currentDate.getDay());
		Iterator<Ticket> itr = ticketRepo.findAllByStatus(Status.valueOf("RESOLVED")).iterator();
		while(itr.hasNext()) {
			Ticket t = itr.next();
			if(t.getResolutiondate().before(oldDate)) {
				System.out.println("Ticket Deleted : "+ t);
				ticketRepo.delete(t);
			}
		}		
	}

}
