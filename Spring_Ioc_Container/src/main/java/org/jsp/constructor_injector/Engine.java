package org.jsp.constructor_injector;

public class Engine {
	
	private int id;
	private String cc;
	
	public Engine(int id, String cc) {
		this.id = id;
		this.cc = cc;
	}
	
	public void engineDetails() {
		
		System.out.println(id);
		System.out.println(cc);
	}
	

}
