package com.tnsif.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
private Heart heart;

//Default Constructor
public Human() {
	this.heart = heart;
}

@Autowired
@Qualifier("humanHeart")
//Achieving DI using setter method
public void setHeart(Heart heart) {
	this.heart = heart;
}

//Achieving DI using constructor
public Human(Heart heart) {
	this.heart = heart;
}


public void startpumping()
{
	heart.pump();
	System.out.println("name of the Animal is:"+heart.getNameOfAnimal() +" "
	+"No of heart is:"+heart.getNoOfHeart()); 
}


}
