package com.technoelevate.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class CooleaguesMainMethod {
	
	public static void main(String[] args) {
		
		HashSet<Colleagues> colleagues=new HashSet<Colleagues>();
		colleagues.add(new Colleagues(24, "Prasnu", " Friend"));
		colleagues.add(new Colleagues(23, "Chandru", "Best Frined"));
		colleagues.add(new Colleagues(18, "siddu", "Friend"));
		colleagues.add(new Colleagues(34, "Parag", " cooeague"));
		
		
	  ArrayList arrayList=new ArrayList(colleagues);
	  
	  Collections.sort(arrayList);
	  System.out.println(arrayList);
	  
	  
	  CooleaguesComaparator comaparator=new CooleaguesComaparator();
	  Collections.sort(arrayList,new CooleaguesComaparator());
	  System.out.println(arrayList);
	  
		
		
	}
	
	

}
