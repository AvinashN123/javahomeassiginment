package com.technoelevate.technoelevateassignments;

import java.util.Iterator;

public class insertArray {

	public static void main(String[] args) {
		
		int ar[]= {56,45,74,63,21};
		ar=insertion(ar,39,3);
	   for (int i = 0; i < ar.length; i++) {
		
		   System.out.print(ar[i]+" ");
	}
		
		
	}

	private static int[] insertion(int[] ar, int ele, int in) {
		if(in<0 || in> ar.length) {
			System.out.println("insertion is not possibale");
			return ar;
		}
		
		
		
		int y[]= new int[ar.length+1];
		for (int i = 0; i<ar.length; i++) {
			if(i<in) {
				y[i]=ar[in];
				
			}
			else {
				y[i+1]=ar[ele];
			}
		}
		
			
		return y;
	}
}
