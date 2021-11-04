package com.technoelevate.exceptionhandling.assiginment;

public class StringIndexOutofBoundException {
	public static void main(String[] args) {
		String str = "Hello how are you";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(40));

		}
	}

}
