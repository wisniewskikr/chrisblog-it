package com.example.controllers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
		
	@KafkaListener(topics = "#{'${topic.name}'}")
	public void greetingListener(String message) {		
		System.out.println(message);		
	}
	
}