package org.jsp.ioc_container;

import org.jsp.constructor_injector.Mouse;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mouse_Driver {

	public static void main(String[] args) {
		
		
		//JEE Container
//		ApplicationContext context= new ClassPathXmlApplicationContext("mouse.xml");
//		 Mouse mouse =(Mouse) context.getBean("mymouse");
//		 mouse.details();
		
		//Core
		
		Resource resource= new ClassPathResource("mouse.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Mouse mouse = (Mouse) factory.getBean("mymouse");
		mouse.details();
		
	}
}
