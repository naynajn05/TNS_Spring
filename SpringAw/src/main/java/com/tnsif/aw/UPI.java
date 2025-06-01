package com.tnsif.aw;

public class UPI {
	
	private String nameOfUpi;
	
	//Setter for DI	
	public void setNameOfUpi(String nameOfUpi) {
		this.nameOfUpi = nameOfUpi;
	}



	public void makePayment()
	{
		System.out.println("Hurray!!!...Payment is done...");
		System.out.println("Using "+nameOfUpi);
	}

}
