package com.tnsif.di1;

public class Amazon {

	GPay gp;

	// setter for DI
	public void setGp(GPay gp) {
		this.gp = gp;
	}

	/*
	 * //Constructor DI public Amazon(GPay gp) { super(); this.gp = gp; }
	 */

	public void startPayment() {
		gp.makePayment();
	}

}
