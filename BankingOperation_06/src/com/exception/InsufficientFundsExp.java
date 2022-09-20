package com.exception;

public class InsufficientFundsExp extends Exception{

	private static final long serialVersionUID = 1L;
	private String message; 
	
	public InsufficientFundsExp(String message) {
		this.message = message;
	}
	
	public String getMessage(){
		return message; 
	}

}