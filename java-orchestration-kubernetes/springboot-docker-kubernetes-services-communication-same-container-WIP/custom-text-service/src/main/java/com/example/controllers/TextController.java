package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.responses.TextResponse;

@RestController
public class TextController {
	
	private Environment environment;	
	
	@Autowired
	public TextController(Environment environment) {
		this.environment = environment;
	}

	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public TextResponse provideText() {
		
		String port = environment.getProperty("local.server.port");
		return new TextResponse("Hello World!", port);
		
	}	
	
}