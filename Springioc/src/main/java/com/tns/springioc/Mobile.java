package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");  //loose coupling
		
		System.out.println("configuration file loaded...!");
		
		sim sim=c.getBean("sim",sim.class);
		sim.calling();
		sim.data();
		
       
	}

}
