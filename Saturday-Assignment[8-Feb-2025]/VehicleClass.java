package Assignment1;

public class VehicleClass {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.drive();
		
		System.out.println("Overriding");
		Car car = new Car();
		car.drive();
	}
}

class Vehicle{
	void drive() {
		System.out.println("Hey, This drive method is from Vehicle class");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}