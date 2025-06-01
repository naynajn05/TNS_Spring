//to demonstrate bean life cycle phases
package com.tnsif.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean,DisposableBean{
	
	private int id;
	private String street;
	private String city;
	private int pincode;
	
	
	
	//default constructor
	public Address() {
		System.out.println("Address Onject");
	}
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("DI is complete....");
		
	}
	
	

}
