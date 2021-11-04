package com.techoelevte.javabasicsarray;

public class PositiveNumber {

	public static void main(String[] args) {
		int ar[]= {1,2,-3,-4,5,6,-8,-9,45,21,-21,-2,3,-4,5,-6,-7,56,-6,5};
		int positiveInt=0;
		int negativeInt=0;
		int oddnumber=0;
		int evennumber=0;
		int zeronumber=0;
		
		for (int i = 0; i < ar.length; i++) {
			
			if(ar[i]>=0) {
				positiveInt=ar[i];
			}
			
		}

		for (int i = 0; i <ar.length; i++) {
			
			if(ar[i]<=0) {
				negativeInt=ar[i];
			}
			
		}
		

		for (int i = 0; i <ar.length; i++) {
			
			if(ar[i]/2!=0) {
				oddnumber++;
			}
		}
			
			

			for (int i1=0; i1 <ar.length; i1++) {
				
				if(ar[i1]/2==0) {
					evennumber++;
				}
			}
				
			for (int n = 0; n <ar.length; n++) {
					
			if(ar[n]==0) {
				zeronumber++;
			 
			}
			}
		
		
		System.out.println("number of postiveIntger "+positiveInt);
		System.out.println("number of postiveIntger "+negativeInt);
		System.out.println("number of postiveIntger "+oddnumber);
		System.out.println("number of postiveIntger "+evennumber);
		System.out.println("number of postiveIntger "+zeronumber);
		
		
		
		
		
		
	}


		}
	
