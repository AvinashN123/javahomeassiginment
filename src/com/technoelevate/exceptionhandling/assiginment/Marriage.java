package com.technoelevate.exceptionhandling.assiginment;

public class Marriage {
	int boysage;
	int girlsage;
	public Marriage(int boysage, int girlsage) {
		super();
		this.boysage = boysage;
		this.girlsage = girlsage;
	}
	
	public void readyForMarriage( int presentboyage,int presentagegirlsage) throws notPossiable {
		if(presentagegirlsage>=boysage && presentagegirlsage>=girlsage) {
			System.out.println("Ready for marriage");
		}
		else
		{
			throw new notPossiable(" not possiable");
		}
		
	    
		
		
	}
	

}
