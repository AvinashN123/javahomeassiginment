package com.technoelevate.Programs;

import java.util.Scanner;

public class FactorialRecursion {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));
	}

	public static void main(String args[]){  
			  Scanner sc=new Scanner(System.in);
			  int number=sc.nextInt();
			  int fact=1;
			  fact = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+fact);   

	}
	}
