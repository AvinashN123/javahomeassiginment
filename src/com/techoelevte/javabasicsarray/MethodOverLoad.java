package com.techoelevte.javabasicsarray;

public class MethodOverLoad {

	   double r;
	  double x;
	  double y;
	
	   
	   public MethodOverLoad(double r) {
		
		this.r = r;
		
	}

	public MethodOverLoad(double d, double e) {
	  
	}

	int area;
	   double reactarea;
	   
	   double methodarea( double r) {
		   
		   if(r<=0) {
			   System.out.println("invalid vale");
		   
		     return r;
		   }
		   
		   else 
			   
			   area =(int) (3.14*r*r);
		   
		   
		   
		return area;
		   
	   }
	   
	   double methodarea1(double x,double y) {
		   if(x<=0 && y<=0) {
			   System.out.println(" invalid value");
		   }
		   
		   
		   else
		   {
			   reactarea=x*y;
		   }   
		 return reactarea;
	   }
}
