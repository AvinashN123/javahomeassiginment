package com.technoelevate.technoelevateassignments;

public class bubblesort1 {

	public static void main(String[] args) {
		
		int a[]= {45,26,89,74};
		int b[]= {85,21,12,32,63};
		
		int c[]=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length && j<b.length) {
		
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			i++;
		}
			
		
	while(i<a.length) {
		c[j]=a[i];
		j++;
		i++;
	}
		
	while(i<b.length) {
		c[j]=b[i];
		j++;
		i++;
	}
		for(int m=0;m<c.length;m++) {
			System.out.print(c[m]+" ");
		}
		
		
		
	}
}
