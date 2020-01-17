package com.si.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.gateway.SimpleGateway;

@RestController
public class SimpleGatewayController {
	
	@Autowired
	private SimpleGateway simpleGateway;
	@RequestMapping(method = RequestMethod.POST, value = "/sendMessage")
	public String hitMessage(@RequestBody String message) {
		
		Message<String> messageinput = MessageBuilder.withPayload(message).build();
		
		Message<String> msgPayload = simpleGateway.passTheMsg(messageinput);
		System.out.println(msgPayload + "--------------------");
		
		return null;
	}
}
