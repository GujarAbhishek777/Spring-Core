package org.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Food_Driver {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Food food=context.getBean(Food.class,"food");
		food.details();
	}

}
