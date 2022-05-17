package com.example.app.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.app.commands.greeting.GreetingCommand;


@Controller
public class GreetingController {

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {		
		return "greeting/greeting";		
	}
	
	@RequestMapping(value="/not-secured-csrf/greeting", method = RequestMethod.GET)
	public String greetingNotSecured(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setAction("not-secured-csrf/greeting-submit");
		command.setHackerPage("hacker-page-not-secured-csrf.html");
		return "greeting-csrf/greeting-csrf";
		
	}
	
	@RequestMapping(value="/not-secured-csrf/greeting-submit", method = RequestMethod.POST)
	public String greetingNotSecuredSubmit(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setAction("not-secured-csrf/greeting-submit");
		command.setMessage(String.format("Hello World %s!", command.getName()));
		command.setHackerPage("hacker-page-not-secured-csrf.html");
		return "greeting-csrf/greeting-csrf";
		
	}
	
	@RequestMapping(value="/secured-csrf/greeting", method = RequestMethod.GET)
	public String greetingSecured(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setAction("secured-csrf/greeting-submit");
		command.setHackerPage("hacker-page-secured-csrf.html");
		return "greeting-csrf/greeting-csrf";
		
	}
	
	@RequestMapping(value="/secured-csrf/greeting-submit", method = RequestMethod.POST)
	public String greetingSecuredSubmit(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setAction("secured-csrf/greeting-submit");
		command.setMessage(String.format("Hello World %s!", command.getName()));
		command.setHackerPage("hacker-page-secured-csrf.html");
		return "greeting-csrf/greeting-csrf";
		
	}
	
}