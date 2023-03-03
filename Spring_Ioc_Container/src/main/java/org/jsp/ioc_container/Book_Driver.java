package org.jsp.ioc_container;

import org.jsp.setter_injector.Book;
import org.jsp.setter_injector.Mobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Book_Driver {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("book.xml");
		Book book= (Book) context.getBean("a777");
		
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		
		System.out.println();
		System.out.println();
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("book.xml");
		Mobile mobile= (Mobile) context.getBean("aa777");
		
		System.out.println(mobile.getId());
		System.out.println(mobile.getPrice());
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getName());
		
		
		
	}
}
