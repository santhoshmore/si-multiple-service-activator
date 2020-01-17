package com.si.demo;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class Counter {
	
	public Message<String> handleCounter(Message<String> message) {
		return message;
	}
}
