package com.example.controllers.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.GreetingJson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GreetingController {

	@RequestMapping(value="/")
	public String greeting() throws JsonProcessingException {
		GreetingJson greeting = new GreetingJson("Hello World!");
		String json = new ObjectMapper().writeValueAsString(greeting);
		System.out.println(json);
		return "Please check Console - greeting message was displayed there.";
		
	}
	
}