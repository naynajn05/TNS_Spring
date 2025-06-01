package com.tnsif.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleLogger {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("------------------");
		
		
		/*//Programmatic approch
		 * Address addressObj=context.getBean("addressObj",Address.class);
		 * System.out.println(addressObj);
		 * 
		 * Person person=context.getBean("person", Person.class);
		 * System.out.println(person);
		 */
		
		//xml approch
		  Address addressObj=context.getBean("addressObj",Address.class);
		  System.out.println(addressObj);
		 
		  Person person=context.getBean("person", Person.class);
		  System.out.println(person);
		 
		
		((AbstractApplicationContext) context).close();
	}
}