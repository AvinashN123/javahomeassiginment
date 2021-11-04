package com.technoelevate.technoelevateassignments;

public class constructorChaining {

	public static void main(String[] args) {
		Pen pen=new Pen();
		Pen pen2=new Pen(36.3, "red");
		Pen pen3=new Pen("bule",20);
		
		pen2.write();
		pen3.write();
	}
	
	
	

}
