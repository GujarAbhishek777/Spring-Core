package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    //@Value(value = "777")
	private int sid;
   // @Value(value = "ABHI")
	private String name;
    //@Value(value = "Bhandup")
	private String address;
	
	//@Autowired      //field injector
	private Pen pen;
	
	//@Autowired
	private Bike bike;

	public Pen getPen() {
		return pen;
	}
    
	//@Autowired
	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	
	public void studentDetails() {
		
		System.out.println(sid);
		System.out.println(name);
		System.out.println(address);
		System.out.println(pen);
		System.out.println(bike);
	}

	@Autowired
	public Student(@Value(value="123") int sid,@Value(value="abhi") String name,@Value(value="thane") String address, Pen pen, Bike bike) {
	
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.pen = pen;
		this.bike = bike;
	}
	
	
	
}
