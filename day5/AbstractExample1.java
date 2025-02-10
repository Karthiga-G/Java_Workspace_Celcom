package com.celcom.day5;

abstract class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	
	abstract void noOfWheels();
	
	abstract void brandName();
}

class Car extends Vehicle{
	void noOfWheels() {
		System.out.println("I have 4 wheels");
	}
	
	void brandName() {
		System.out.println("My brand name is Benz");
	}
}

abstract public class AbstractExample1 { 

	public static void main(String[] args) {
		Vehicle vec = new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}

}
