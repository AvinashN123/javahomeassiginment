package com.technoelevate.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class TrainerMainMethod {
	public static void main(String[] args) {
		
		
		ArrayList<Trainer> list=new ArrayList<Trainer>();
		list.add(new Trainer(123, "Avinash", "3 years Experince"));
		list.add(new Trainer(321, "Megha", "4 years Experince"));
		list.add(new Trainer(564, "Manu", "5 years Experince"));
		list.add(new Trainer(963, "Manu", "6 years Experince"));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		TrainComparatorMethod comparatorMethod=new TrainComparatorMethod();
		
		Collections.sort(list,new TrainComparatorMethod());
		System.out.println(list);
		
	}

}
