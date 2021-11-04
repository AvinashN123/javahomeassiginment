package com.technoelevate.technoelevateassignments;

public class bubblesort {

	

	public static void main(String[] args) {
		
		 int a[]= {12,45,85,74};
		  int c[]= new int[a.length];
		  int i=0,k=0;
		  int small=0;
		  while(i<a.length) {
			  if(a[i]<small) {
				  c[k]=a[i];
			  k++;
			  i++;
			  }
		  }
		  
		  System.out.println(c[k]);
		  
	}

}
