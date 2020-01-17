package com.si.demo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.si.demo.Ticket.Priority;

public class TicketGenerator {
	private long nextTicketId;
	
	public TicketGenerator() {
		this.nextTicketId = 1000L;
	}
	
	public List<Ticket> createTickets(){
		List<Ticket> tickets = new ArrayList<Ticket>();
		tickets.add(createLowPriorityTicket());
		tickets.add(createLowPriorityTicket());
		tickets.add(createLowPriorityTicket());
		tickets.add(createLowPriorityTicket());
		tickets.add(createLowPriorityTicket());
		
		tickets.add(createMediumPriorityTicket());
		tickets.add(createMediumPriorityTicket());
		tickets.add(createMediumPriorityTicket());
		tickets.add(createMediumPriorityTicket());
		tickets.add(createMediumPriorityTicket());
		
		tickets.add(createHighPriorityTicket());
		tickets.add(createHighPriorityTicket());
		tickets.add(createHighPriorityTicket());
		tickets.add(createHighPriorityTicket());
		tickets.add(createHighPriorityTicket());
		
		tickets.add(createEmergencyTicket());
		tickets.add(createEmergencyTicket());
		tickets.add(createEmergencyTicket());
		tickets.add(createEmergencyTicket());
		tickets.add(createEmergencyTicket());
		
		return tickets;
	}
	
	Ticket createEmergencyTicket() {
		return createTicket(Priority.emergency, "Urgent problem. Fix immediately or revenue will lost!");
	}
	
	Ticket createHighPriorityTicket() {
		return createTicket(Priority.high, "Serious issue. Fix immediately.");
	}
	
	Ticket createMediumPriorityTicket() {
		return createTicket(Priority.medium, "There is an issue; take a look whenever you have time.");
	}
	
	Ticket createLowPriorityTicket() {
		return createTicket(Priority.low, "Some minor problems have been found.");
	}
	
	Ticket createTicket(Priority priority, String description) {
		Ticket ticket = new Ticket();
		ticket.setTicketid(nextTicketId++);
		ticket.setPriority(priority);
		ticket.setIssueDateTime(GregorianCalendar.getInstance());
		ticket.setDescription(description);
		return ticket;
	}
	
}
