package org.jsp.ioc_container;

import org.jsp.constructor_injector.Cricketer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer_Driver {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("cricketer.xml");
		 Cricketer cricketer=(Cricketer) context.getBean("mycricketer");
		 cricketer.details();
	}
}
