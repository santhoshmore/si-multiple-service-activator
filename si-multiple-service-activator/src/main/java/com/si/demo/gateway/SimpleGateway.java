package com.si.demo.gateway;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public interface SimpleGateway {

	public Message<String> passTheMsg(Message<String> message);
}
