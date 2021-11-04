package com.technoelevate.technoelevateassignments;

public class rectangleusingConstructor {

	double l;
	double b;
	public rectangleusingConstructor(double l, double b) {
		
		this.l = l;
		this.b = b;
		
	}
	
	 void  getarea() {
		
		System.out.println("area is"+l*b);
	}
	 
	 
	 void getParametre(){
		 
		 System.out.println("parametre is "+2*(l*b));
	 }
	 
	 
	 
	 
	 public static void main(String[] args) {
		
		 rectangleusingConstructor rectangle=new rectangleusingConstructor(2.3, 3.3);
		 
		 rectangle.getarea();
		rectangle.getParametre();
		 
	}
	 
}
