package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servicelayer.TicketServiceClass;
import com.example.demo.servicelayer.pojos.CreateTicketPojo;
import com.example.demo.servicelayer.pojos.DeleteResponsePojo;
import com.example.demo.servicelayer.pojos.ResponseSeatPojo;
import com.example.demo.servicelayer.pojos.ResponseTicketPojo;

@RestController
public class TicketController {
	
	
	@Autowired
	private TicketServiceClass ticketServiceClass;

	
	@PostMapping("/newTicket")
	public ResponseEntity<ResponseTicketPojo> getBookedTicket(@RequestBody   CreateTicketPojo createTicketPojo){
		ResponseEntity<ResponseTicketPojo> newTicket = ticketServiceClass.newuser(createTicketPojo);
		return newTicket;
		
	}
	
	@GetMapping("/getuserTicketsList/{firstName}/{lastName}/{emailAddress}")
	public List<ResponseTicketPojo> allTicketsDataForUser(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName, @PathVariable("emailAddress") String emailAddress) {
		List<ResponseTicketPojo> ticketDetails = ticketServiceClass.getTicketDetails(firstName, lastName, emailAddress);

		return ticketDetails;

	}
	
	@GetMapping("/removeUser/{firstName}/{lastName}/{emailAddress}")
	public DeleteResponsePojo deleteUser(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName, @PathVariable("emailAddress") String emailAddress) {
		DeleteResponsePojo ticketDetailsForDelete = ticketServiceClass.getTicketDetailsForDelete(firstName, lastName, emailAddress);
		
		return ticketDetailsForDelete;
		
	}
	
	
	@GetMapping("/userSeats/{section}")
	public List<ResponseSeatPojo> getsectionUsers(@PathVariable("section") String section) {
		List<ResponseSeatPojo> getuserandSeats = ticketServiceClass.getuserandSeats(section);
		return getuserandSeats;
		
	}
	
	
	
	
}