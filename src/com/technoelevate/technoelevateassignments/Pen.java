package com.technoelevate.technoelevateassignments;

public class Pen {
    String colour;
     double price;
    
   public   Pen(){
    	System.out.println("Pen object is a created");
    }

	public Pen(String colour, double price) {
	    this();
		this.colour = colour;
		this.price = price;
	}
	
	
	public Pen(double price,String colour) {
		this(colour,price);
	}
	
	
  void write() {
	  System.out.println(colour +"is writing");
  }
	
}
