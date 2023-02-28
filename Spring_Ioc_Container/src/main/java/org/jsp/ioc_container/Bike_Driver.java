package org.jsp.ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bike_Driver {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("bike.xml");
		Bike bike=(Bike) context.getBean("mybike");
		System.out.println(bike);
		bike.start();
		bike.off();
	}
}
