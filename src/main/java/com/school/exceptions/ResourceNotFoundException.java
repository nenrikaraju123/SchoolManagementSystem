package com.school.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
	boolean status;
	String messages;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public ResourceNotFoundException() {
		super();
	}
	public ResourceNotFoundException(boolean status, String messages) {
		super();
		this.status = status;
		this.messages = messages;
	}

}
