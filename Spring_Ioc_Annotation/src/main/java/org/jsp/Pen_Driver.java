package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen_Driver {
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springconfiguration.xml");
		//Pen pen=context.getBean(Pen.class,"pen");
		
		//it will not give error 95%
		//Pen pen=context.getBean(Pen.class,"cow");
		
		
		//Pen pen=(Pen)context.getBean("pen");
		
//		it will give error
		//Pen pen=(Pen)context.getBean("cow");
		
	//	pen.detatils();
		
		
		
		
		
		
		Bike bike=(Bike) context.getBean("bike");
		bike.bikeDetatils();
		
		System.out.println("*************************************************************");
		
		Student student=(Student)context.getBean("student");
		
		student.studentDetails();
		
		System.out.println("******************************");
		student.getPen().detatils();
		
		System.out.println("********************************");
		student.getBike().bikeDetatils();
		
	}

}
