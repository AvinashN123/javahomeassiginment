package com.technoelevate.exceptionhandling.assiginment;

public class ThrowsExample {
	public static void main(String[] args)  {
		
		try {
			throwkeyWord();
		} catch (familyException e) {
			System.out.println("Family Exception");
		}
			
		
		
	}

	private static void throwkeyWord() throws familyException {
		System.out.println("ThrowKeyWord Method");
		mother();
		
	}

	private static void mother() throws familyException {
		System.out.println(" My mother is Bhagya");
		son();
		
		
	}

	private static void son() throws familyException {
		System.out.println("Son name is : manu");
		daughter();
		
	}

	private static void daughter() throws familyException {
		System.out.println("daughter name is: Jhanu");
		 father();
		
	}

	private static void father() throws familyException {
		System.out.println("Father name is Natraj");
		throw new familyException("Family Exception");
		
	}

}
