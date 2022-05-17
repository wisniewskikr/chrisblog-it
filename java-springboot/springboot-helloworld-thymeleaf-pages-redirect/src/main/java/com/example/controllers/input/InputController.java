package com.example.controllers.input;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.commands.input.InputCommand;


@Controller
public class InputController {

	@RequestMapping(value="/input")
	public String greeting(@ModelAttribute("command") InputCommand command) {
		
		command.setText("To display greeting message please click");
		return "input/input";
		
	}
	
}