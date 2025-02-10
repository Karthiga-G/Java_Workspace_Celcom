package com.celcom.day5;

interface VehiclePlan1{
	void noOfEngine(); //by default, every interface methods are public abstract method 
}

interface VehiclePlan2 {
	void noOfWheels();
	void brandName();
}

abstract class Vehicle1 implements VehiclePlan1, VehiclePlan2{
	public void noOfEngine() {
		System.out.println("I have one engine");
	}
}

class Car1 extends Vehicle1{
	public void noOfWheels() {
		System.out.println("I have 4 wheels");
	}
	
	public void brandName() {
		System.out.println("My brand name is Benz");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclePlan1 vec = new Car1();
		vec.noOfEngine();
//		vec.noOfWheels();
//		vec.brandName();

	}

}
