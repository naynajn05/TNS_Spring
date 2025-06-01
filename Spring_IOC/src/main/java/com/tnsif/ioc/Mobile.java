package com.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml"); //loose coupling
		
		Sim s=c.getBean("sim",Sim.class);
		s.calling();
		s.browsing();

	}

}
