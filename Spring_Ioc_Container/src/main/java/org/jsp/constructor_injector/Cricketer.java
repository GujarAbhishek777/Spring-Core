package org.jsp.constructor_injector;

public class Cricketer {
	private int bid;
	private String name;
	private double price;
	private String team;
	public Cricketer(int bid, String name, double price, String team) {
		super();
		this.bid = bid;
		this.name = name;
		this.price = price;
		this.team = team;
	}
	
	
	public void details() {
		System.out.println(bid);
		System.out.println(name);
		System.out.println(price);
		System.out.println(team);
	}

}
