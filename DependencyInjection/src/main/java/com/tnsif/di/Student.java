package com.tnsif.di;

public class Student {

	private String studentName;

	private int id;
	
	
	
	   public void setId(int id) { this.id = id; }
	  
	  public void setStudentName(String studentName) { this.studentName =
	  studentName; } 
	 
	
	//DI using constructor

	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}
	
	
	void disp() {
		System.out.println("Student Name is " + studentName+" "+"and id is "+id);
	}



}
