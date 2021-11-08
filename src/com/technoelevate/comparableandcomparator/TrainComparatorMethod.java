package com.technoelevate.comparableandcomparator;

import java.util.Comparator;

public class TrainComparatorMethod implements Comparator<Trainer> {

	@Override
	public int compare(Trainer o1, Trainer o2) {
		
		return o2.experince.compareTo(o1.experince);
	}

}
