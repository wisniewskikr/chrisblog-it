package com.example.app.commands.greeting;

public class GreetingCommand {
	
	private String message;
	private String name;
	private String action;
	private String hackerPage;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getHackerPage() {
		return hackerPage;
	}
	public void setHackerPage(String hackerPage) {
		this.hackerPage = hackerPage;
	}
	
}