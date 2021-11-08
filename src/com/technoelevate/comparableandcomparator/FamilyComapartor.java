package com.technoelevate.comparableandcomparator;

import java.util.Comparator;

public class FamilyComapartor  implements Comparator<Family>{

	@Override
	public int compare(Family o1, Family o2) {
		
		return o2.age-o1.age;
	}

}
