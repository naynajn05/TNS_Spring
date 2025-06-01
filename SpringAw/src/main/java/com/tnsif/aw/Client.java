package com.tnsif.aw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Flipkart fk=c.getBean("fk",Flipkart.class);
		fk.buy();
	}

}
