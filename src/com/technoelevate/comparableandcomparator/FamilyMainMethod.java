package com.technoelevate.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyMainMethod {
	public static void main(String[] args) {

		ArrayList<Family> families = new ArrayList<Family>();
		families.add(new Family(21, "Avi", "Son"));
		families.add(new Family(52, "natraj", "Father"));
		families.add(new Family(39, "Bhagya", "Mother"));
		families.add(new Family(20, "megha", "Sister"));

		Collections.sort(families);
		System.out.println(families); 

		FamilyComapartor comapartor = new FamilyComapartor();
		Collections.sort(families, new FamilyComapartor());
		System.out.println(families);

	}

}
