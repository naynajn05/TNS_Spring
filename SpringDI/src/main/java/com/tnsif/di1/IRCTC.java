package com.tnsif.di1;

public class IRCTC {
	
GPay gp;
	
	
	//setter for DI
	public void setGp(GPay gp) {
		this.gp = gp;
	}


	public void bookTicket()
	{
		gp.makePayment();
	}


}
