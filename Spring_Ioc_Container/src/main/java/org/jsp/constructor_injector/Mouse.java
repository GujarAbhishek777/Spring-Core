package org.jsp.constructor_injector;

public class Mouse {
	
	private int id;
	private String brand;
	private String type;
	private double price;
	
	
	public Mouse(int id, String brand, String type, double price) {
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	
	public void details() {
		
		System.out.println(id);
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
	}
	

}
