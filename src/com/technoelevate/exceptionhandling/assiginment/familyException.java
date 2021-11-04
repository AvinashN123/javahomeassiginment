package com.technoelevate.exceptionhandling.assiginment;

public class familyException extends Exception {
	String msg;

	public familyException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
