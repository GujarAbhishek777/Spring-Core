package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	
	@Value(value="25.5")
	private double price;
	@Value(value="cello")
	private String brand;
	
	
	public void detatils()
	{
		System.out.println(price);
		System.out.println(brand);
	}
	

}
