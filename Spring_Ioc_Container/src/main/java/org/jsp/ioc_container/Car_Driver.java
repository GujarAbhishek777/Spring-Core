package org.jsp.ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Driver {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("car.xml");
		Car car=(Car) context.getBean("mycar");
		System.out.println(car);
		car.start();
		car.off();
	}
}
