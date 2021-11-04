package com.technoelevate.exceptionhandling.assiginment;

public class MainMethod {

	public static void main(String[] args) throws notEligiableForVoteing {
		Person person = new Person(18);
		person.eligiableForVote(14);
	}

}
