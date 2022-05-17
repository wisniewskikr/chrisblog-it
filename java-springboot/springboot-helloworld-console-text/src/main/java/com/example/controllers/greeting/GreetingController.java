package com.example.controllers.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping(value="/")
	public String greeting() {
		System.out.println("Hello World!");
		return "Please check Console - greeting message was displayed there.";
		
	}
	
}