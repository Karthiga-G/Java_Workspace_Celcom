package com.celcom.day3;

class Vehicle{
	void noOfEngine(){
		System.out.println("I have one engine");
	}
}

class TwoWheeler extends Vehicle{
	void noOfWheels(){
		System.out.println("I have 2 wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("My brand name is Honda");
	}
}

class Scooty extends TwoWheeler{
	void brandName() {
		System.out.println("My brand is Activa");
	}
}
class FourWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have 4 wheels");
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TwoWheeler Class");
		TwoWheeler two = new TwoWheeler();
		two.noOfEngine();
		two.noOfWheels();
		
		System.out.println("Bike Class");
		Bike honda = new Bike();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
		
		System.out.println("Scooty class");
		Scooty activa = new Scooty();
		activa.noOfEngine();
		activa.noOfWheels();
		activa.brandName();
	}

}
