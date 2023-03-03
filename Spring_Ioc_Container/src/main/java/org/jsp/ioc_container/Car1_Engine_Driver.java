package org.jsp.ioc_container;

import org.jsp.constructor_injector.Car1;
import org.jsp.constructor_injector.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car1_Engine_Driver {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("carengine.xml");
		Car1 car=(Car1) context.getBean("mycar1");
		car.carDetails();
		car.getEngine().engineDetails();
		
		//Engine engine=(Engine) context.getBean("engine1");
		//engine.engineDetails();
		
	}
}
