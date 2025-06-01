package com.tnsif.aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {

	UPI upi;
	

	// Setter for DI
	@Autowired
	@Qualifier("PhonePeUpi")
	public void setUpi(UPI upi) {
		this.upi = upi;
	}

	/*
	 * public Flipkart(UPI upi) { super(); this.upi = upi; }
	 */

	public void buy() {
		upi.makePayment();
	}

}
