package com.aurionpro.util;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
	String message;
	public InsufficientBalanceException(String message) {
		super(message);
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message.getClass().getName()+" : "+message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.message.getClass().getName()+" : ";
	}
	
	

}
