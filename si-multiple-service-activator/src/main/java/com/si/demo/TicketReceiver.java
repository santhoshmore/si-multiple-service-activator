package com.si.demo;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class TicketReceiver {
	
	public Message<String> handleTicket(Message<String> message) {
		System.out.println("Received ticket - " + message.getPayload());
		return message;
	}
}
