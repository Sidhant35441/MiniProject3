package com.sidhant.exception;

public class InvalidSocialSecurityNumberException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidSocialSecurityNumberException() {
		
	}
	public InvalidSocialSecurityNumberException(String msg) {
		super(msg);
	}

}
