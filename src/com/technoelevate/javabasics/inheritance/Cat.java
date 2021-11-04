package com.technoelevate.javabasics.inheritance;

public class Cat  extends Animal{

	public Cat(int leg, String name) {
		super(leg, name);
		
	}
	void sound() {
		System.out.println(" meo meo");
	}

	
}
