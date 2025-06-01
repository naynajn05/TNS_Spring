//to demonstrate DI in the form of literals
package com.tnsif.di;

public class Student {
	
	//Literal dependency
	private String studentName;
	private int id;
	
	
	
	//DI using constructor
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}

	/*
	 * //setter for DI
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 * 
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	void disp()
	{
		System.out.println("Student name: "+studentName);
		System.out.println("Student id: "+id);
	}

}
