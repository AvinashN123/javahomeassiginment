package com.technoelevate.Programs;

public class StringInternMethod {
	public static void main(String[] args) {
		String s=new String("Sachin");    
		String s2=s.intern();    
		System.out.println(s2);
	}

}
