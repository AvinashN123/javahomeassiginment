package com.technoelevate.exceptionhandling.assiginment;

public class Person {
	int age;

	public Person(int age) {
		super();
		this.age = age;
	}

	public void eligiableForVote(int presentage) throws notEligiableForVoteing {
		if (presentage >= age) {
			System.out.println("Eligiable for vote...");
		} else {
			throw new notEligiableForVoteing("Not eligiable for vote..");
		}

	}

}
