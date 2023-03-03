package org.jsp.setter_injector;

public class AnimalSound {

	Animal a;

	public AnimalSound(Animal a) {
		this.a = a;
	}
	
	public void Sound() {
		a.doSound();
	}
	
}
