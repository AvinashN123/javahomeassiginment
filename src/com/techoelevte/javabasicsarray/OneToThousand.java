package com.techoelevte.javabasicsarray;

public class OneToThousand {
	public static void main(String[] args) {
	
		int arr[]=new int[5];
		int sum=0;
		int index=0;
		
	     for(int i=1;i<=1000;i++) {
	    	 if(index==5) {
	    		 break;
	    	 }
	    	 
	    	 
	    	 if(i%3==0 && i%5==0) {
	    		 arr[index]=i;
	    		 index++;
	    	 }
	    	 
	    	 
	     }
	     
	     
	     for(int i=0;i<arr.length;i++) {
	    	 sum=sum+arr[i];
	     }
		
		System.out.println(sum);
	}

	
}
