package com.example.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.responses.GreetingResponse;

@RestController
public class GreetingController {

	@GetMapping(value="/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> greetingGet() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "GET: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> greetingPost() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "POST: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/security-one/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> securityOneGreetingGet() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "GET Security One: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/security-one/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> securityOneGreetingPost() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "POST Security One: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/security-two/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> securityTwoGreetingGet() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "GET Security Two: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/security-two/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> securityTwoGreetingPost() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "POST Security Two: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}