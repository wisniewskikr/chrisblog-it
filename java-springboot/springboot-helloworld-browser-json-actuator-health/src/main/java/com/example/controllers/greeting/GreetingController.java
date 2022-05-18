package com.example.controllers.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.GreetingJson;

@RestController
public class GreetingController {

	@RequestMapping(value="/")
	public GreetingJson greeting() {		
		return new GreetingJson("Hello World!");	
	}
	
}