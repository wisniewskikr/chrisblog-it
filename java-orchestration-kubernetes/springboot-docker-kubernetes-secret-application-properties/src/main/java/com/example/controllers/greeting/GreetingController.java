package com.example.controllers.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value(value = "${secret_message_hello}")
	private String secretMessageHello;
	
	@Value(value = "${secret_message_world}")
	private String secretMessageWorld;
	
	@Value(value = "${secret_message_exclamation}")
	private String secretMessageExclamation;

	@RequestMapping(value="/")
	public String greeting() {		
		return secretMessageHello + " " + secretMessageWorld + secretMessageExclamation;
	}
	
}