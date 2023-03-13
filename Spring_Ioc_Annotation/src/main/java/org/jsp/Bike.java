package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	private int id;
	private String name;
	private String color;
	private double price;
	public Bike(@Value(value="101")int id,@Value(value="Bullet") String name,@Value(value="Black") String color,@Value(value="123456") double price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void bikeDetatils() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
	
	
	
	
	
}
