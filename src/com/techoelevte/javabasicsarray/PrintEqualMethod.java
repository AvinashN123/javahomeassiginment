package com.techoelevte.javabasicsarray;

public class PrintEqualMethod {

	int x;
	int y;
	int z;
	public PrintEqualMethod(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	 void printEqual(int x,int y,int z) {
		if(x<=0 && y<=0 && z<=0) 
		 System.out.println("Invalid value ");
		
		else if(x==y &&y==x && x==z && y==z)
			System.out.println(" all numbers are equal");
		
		else if(x!=y && y!=z && x!=z)
			System.out.println("All numbers are different ");
		
		else
			
			System.out.println("Neither all are equal or different");
		 
	 }
	 
	 public static void main(String[] args) {
		
		 PrintEqualMethod method=new PrintEqualMethod(2,2,2);
		 method.printEqual(-1,-2,-3);
		 
		 
	}

}
