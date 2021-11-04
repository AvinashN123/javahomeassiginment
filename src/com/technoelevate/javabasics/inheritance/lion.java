package com.technoelevate.javabasics.inheritance;

public class lion  extends Animal {

	public lion(int leg, String name) {
		super(leg, name);
		
	}
	
	void sound() {
		System.out.println("roar roar");
	}


}
