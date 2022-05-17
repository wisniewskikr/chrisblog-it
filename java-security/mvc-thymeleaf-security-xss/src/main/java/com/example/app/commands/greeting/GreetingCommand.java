package com.example.app.commands.greeting;

public class GreetingCommand {
	
	private String text;
	private String url;	
	private String gootleLinkText;

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getGootleLinkText() {
		return gootleLinkText;
	}
	public void setGootleLinkText(String gootleLinkText) {
		this.gootleLinkText = gootleLinkText;
	}
	
}