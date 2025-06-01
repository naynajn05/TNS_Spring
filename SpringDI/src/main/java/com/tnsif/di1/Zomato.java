package com.tnsif.di1;

public class Zomato {
	
	GPay gp;
	
	
	
	//setter for DI
	public void setGp(GPay gp) {
		this.gp = gp;
	}


	public void doPayment()
	{
		gp.makePayment();
	}

}
