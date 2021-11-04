package com.technoelevate.exceptionhandling.assiginment;

public class notEligiableForVoteing extends Exception {

	String msg;

	public notEligiableForVoteing(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
