package com.example.app.controllers.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coverity.security.Escape;
import com.example.app.commands.greeting.GreetingCommand;


@Controller
public class GreetingController {

	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String greeting(@ModelAttribute("command") GreetingCommand command) {		
		return "greeting/greeting";		
	}
	
	@RequestMapping(value="default-xss/greeting", method = RequestMethod.GET)
	public String greetingDefault(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		command.setGootleLinkText("Go To Gootle Page");
		return "greeting-xss/greeting-xss";
		
	}
	
	@RequestMapping(value="/not-secured-xss/greeting", method = RequestMethod.GET)
	public String greetingNotSecured(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setText("Hello World!");
		command.setGootleLinkText("Go To Gootle Page (XSS Attacted and Not Secured)");
		return "greeting-xss/greeting-xss";
		
	}
	
	@RequestMapping(value="/secured-xss/greeting", method = RequestMethod.GET)
	public String greetingSecured(
			@ModelAttribute("command") GreetingCommand command) {
		
		command.setUrl(secureXss(command.getUrl()));
		command.setText("Hello World!");
		command.setGootleLinkText("Go To Gootle Page (XSS Attacted but Secured)");
		return "greeting-xss/greeting-xss";
		
	}
	
	private String secureXss(String url) {		
		String escapedUrl = Escape.htmlText(Escape.jsString(url));
		return escapedUrl.replace("\\u002F", "/");		
	}
	
}