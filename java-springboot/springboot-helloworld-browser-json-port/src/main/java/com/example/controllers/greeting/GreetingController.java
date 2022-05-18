package com.example.controllers.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.GreetingJson;

@RestController
public class GreetingController {
	
private Environment environment;	
	
	@Autowired
	public GreetingController(Environment environment) {
		this.environment = environment;
	}

	@RequestMapping(value="/")
	public GreetingJson greeting() {
		
		String port = environment.getProperty("local.server.port");
		return new GreetingJson("Hello World!", port);
		
	}
	
}