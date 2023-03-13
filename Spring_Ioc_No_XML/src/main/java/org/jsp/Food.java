package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
	@Value(value = "Puran Poli")
	private String name;
	@Value(value = "200")
	private double price;
	@Value(value = "MAH")
	private String region;
	
	public void details() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(region);
	}
	
	

}
