package com.techoelevte.javabasicsarray;

public class Array {

	  public static void main(String[] args) {
		
		  int ar[]= {20,30,25,35,-16,60,-100};
		  int sum=0;
		  for(int i=0;i<ar.length;i++) {
			  
			  sum=sum+ar[i];
		  }
		  
		  int average=sum/ar.length;
		  
		  System.out.println("avearge of array"+average);
		  
		  
	}
	  
	  
	  
	  
	  
}
