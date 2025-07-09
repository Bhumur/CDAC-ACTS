package com.bhumur.Ticket.service;

import java.util.Iterator;

import org.springframework.http.ResponseEntity;

import com.bhumur.Ticket.dto.TicketDTO;
import com.bhumur.Ticket.entity.Ticket;

public interface TicketService {
	public ResponseEntity<String> addTicket(Ticket ticket);
	public TicketDTO updateTicket(Ticket ticket);
	public Iterator<TicketDTO> allOpenTickets();
	public TicketDTO getTicketById(int ticketId);
	public void deleteOlderTickets();
}
