package org.jsp.constructor_injector;

public class Car1 {

	private String name;
	private String color;
	private double price;
	
	private Engine engine;
	
	

	public Car1(String name, String color, double price, Engine engine) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}
	
	public void carDetails() {
		
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		//System.out.println(engine);
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car1 [name=" + name + ", color=" + color + ", price=" + price + ", engine=" + engine + "]";
	}
	
	
	
	
}
