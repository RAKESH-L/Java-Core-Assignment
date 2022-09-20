package com.exception;

public class OverTheLimitExp extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message; 
	
	public OverTheLimitExp(String message) {
		this.message = message; 
	}
	
	public String getMessage(){
		return message; 
	}

}
