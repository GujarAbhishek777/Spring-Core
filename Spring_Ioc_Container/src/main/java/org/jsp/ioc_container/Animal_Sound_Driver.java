package org.jsp.ioc_container;

import org.jsp.setter_injector.AnimalSound;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal_Sound_Driver {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("animal.xml");
		AnimalSound animalSound= (AnimalSound) context.getBean("asound");
		animalSound.Sound();
	}
}
