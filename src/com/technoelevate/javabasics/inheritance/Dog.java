package com.technoelevate.javabasics.inheritance;

public class Dog  extends Animal{

	public Dog(int leg, String name) {
		super(leg, name);
		
		
	}

   void bark() {
	   System.out.println("dog is barking");
   }

}
