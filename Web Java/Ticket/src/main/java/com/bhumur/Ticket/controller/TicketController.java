package com.bhumur.Ticket.controller;


import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhumur.Ticket.dto.TicketDTO;
import com.bhumur.Ticket.entity.Ticket;
import com.bhumur.Ticket.service.TicketService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/Ticket")
public class TicketController{
	
	@Autowired
	TicketService ticketService;

	@PostMapping("/create")
	public ResponseEntity<String> createTicket(@RequestBody Ticket ticket) {
		System.out.println("create");
		return  ticketService.addTicket(ticket);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<TicketDTO> getTicketById(@PathVariable("id") int id) {
	    System.out.println("findByid");
	    TicketDTO dto = ticketService.getTicketById(id);
	    return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	
	@PostMapping("/update")
	public ResponseEntity<TicketDTO> updateTicket(@RequestBody Ticket ticket) {
		System.out.println("update");
		TicketDTO dto = ticketService.updateTicket(ticket);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@GetMapping("/getAllOpen")
	public Iterator<TicketDTO> getAll(){
		System.out.println("all");
		return ticketService.allOpenTickets();
	}
	
	
}
