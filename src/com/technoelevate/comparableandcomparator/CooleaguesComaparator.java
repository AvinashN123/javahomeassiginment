package com.technoelevate.comparableandcomparator;

import java.util.Comparator;

public class CooleaguesComaparator implements Comparator<Colleagues>{

	@Override
	public int compare(Colleagues o1, Colleagues o2) {
		
		return o2.relation.compareTo(o1.relation);
	}

}
