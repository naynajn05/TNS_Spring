package com.tnsif.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		//Amazon a=new Amazon();  //not a correct approach
		//a.startPayment();

		
		ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
		Amazon a=c.getBean("a",Amazon.class);
		a.startPayment();
		
		Zomato z=c.getBean("z",Zomato.class);
		z.doPayment();
		
		IRCTC i=c.getBean("i",IRCTC.class);
		i.bookTicket();
	}

}
