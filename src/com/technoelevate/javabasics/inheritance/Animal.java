package com.technoelevate.javabasics.inheritance;

public class Animal {

	int leg;
	String name;
	public Animal(int leg, String name) {
		this.leg = leg;
		this.name = name;
	}
	
	void eat() {
		System.out.println("Animal is eating");
	}
	

}
