package com.example.responses;


public class TextResponse {	
	
	private String text;
	private String port;
	
	public TextResponse(String text, String port) {
		this.text = text;
		this.port = port;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}	
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
}