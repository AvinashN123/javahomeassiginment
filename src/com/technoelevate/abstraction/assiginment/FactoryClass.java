package com.technoelevate.abstraction.assiginment;

public class FactoryClass {

	Person person = null;

	public Person getPerson(String name) {
		if (name.equalsIgnoreCase("Avi")) {
			person = new Avi();
		} else if (name.equalsIgnoreCase("Nithin")) {
			person = new Nithin();
		}

		else if (name.equalsIgnoreCase("Pransu")) {
			person = new Pransu();

		} else {
			person = new Siddu();

		}

		return person;

	}

}
