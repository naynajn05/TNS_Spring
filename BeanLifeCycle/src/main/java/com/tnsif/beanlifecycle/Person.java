//to demonstrate bean life cycle

package com.tnsif.beanlifecycle;

//entity
public class Person {
	private int id;
	private String name;
	private String contactNo;
	
	//Dependency
	private AddressOne address;

	
	//default constructor
	public Person() {
		System.out.println("Person obect");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public AddressOne getAddress() {
		return address;
	}

	public void setAddress(AddressOne address) {
		this.address = address;
	}
	
	//injecting address into Person 
	Person(AddressOne address)
	{
		this.address=address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address + "]";
	}
	
	

}
