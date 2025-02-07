package com.celcom.day4;

class Vehicle {
	void engine() {
		System.out.println("All vehicles has an engine.");
	}
	void wheels() {
		System.out.println("All vehicles has wheels.");
	}
}

class Wheels{
	void wheelModel() {
		System.out.println("Wheel model is MRF");
	}
	
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler"))
			System.out.println("I have two wheels");
		else if(vehicleType.equals("Four Wheeler"))
			System.out.println("I have four wheels");
	}
}

class Engine{
	void engineModel() {
		System.out.println("Engine model is XYZ");
	}
	
	void noOfEngine() {
			System.out.println("I have one Engine");
	}
}

//'Is a' relationship
class Car extends Vehicle{
	Wheels wheel = new Wheels();//'Has a' relationship
	Engine engine = new Engine();//'Has a' relationship
	
	void engineModel() {
		engine.engineModel();
	}
	
	void WheelModel() {
		wheel.wheelModel();
	}
	
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}

public class IsAandHasA {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.engine();
		car.engineModel();
		car.WheelModel();
		car.noOfWheels();
		
		Wheels wheel = new Wheels();
		wheel.wheelModel();
		wheel.noOfWheels("Four Wheeler");
	}

}
