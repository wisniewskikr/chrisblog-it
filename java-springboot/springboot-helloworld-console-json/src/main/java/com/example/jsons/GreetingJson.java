package com.example.jsons;

public class GreetingJson {
	
	private String message;	
	
	public GreetingJson() {}

	public GreetingJson(String message) {		
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	

}
