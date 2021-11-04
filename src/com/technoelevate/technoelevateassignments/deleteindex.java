package com.technoelevate.technoelevateassignments;

public class deleteindex {
public static void main(String[] args) {
	int ar[]= {1,2,3,4,5};
	ar=deletearray(ar,2);
	
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	
	
}

private static int[] deletearray(int[] ar, int in) {
     
	   if(in<0 || in>= ar.length) {
		   System.out.println("insertion is not possible");
		   return ar;
	   }
	   
	   
	   int y[]=new int [ar.length-1];
	   for(int i=0;i<ar.length-1;i++) {
		   
		   if(i<in) {
			y[i]=ar[i];
		   }
	   
	   else {
		   y[i]=ar[i+1];
	   }
	   }

	return y;
}

}
