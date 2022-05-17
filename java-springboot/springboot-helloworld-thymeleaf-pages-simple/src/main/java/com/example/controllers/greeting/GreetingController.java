package com.example.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.commands.greeting.GreetingCommand;


@Controller
public class GreetingController {

	@RequestMapping(value="/")
	public String greeting(@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		return "greeting/greeting";
		
	}
	
}