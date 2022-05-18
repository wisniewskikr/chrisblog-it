package com.example.jsons;

public class GreetingJson {
	
	private String message;
	private String port;
	
	public GreetingJson() {}

	public GreetingJson(String message, String port) {		
		this.message = message;
		this.port = port;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}	
	
}
