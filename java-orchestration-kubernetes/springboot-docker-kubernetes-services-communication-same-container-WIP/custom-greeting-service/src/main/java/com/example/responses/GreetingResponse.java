package com.example.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetingResponse {	
	
	private String greeting;
	@JsonProperty(value = "greeting port")
	private String greetingPort;
	@JsonProperty(value = "text port")
	private String textPort;
	
	public GreetingResponse(String greeting, String greetingPort, String textPort) {
		this.greeting = greeting;
		this.greetingPort = greetingPort;
		this.textPort = textPort;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getGreetingPort() {
		return greetingPort;
	}
	public void setGreetingPort(String greetingPort) {
		this.greetingPort = greetingPort;
	}
	public String getTextPort() {
		return textPort;
	}
	public void setTextPort(String textPort) {
		this.textPort = textPort;
	}
	
}