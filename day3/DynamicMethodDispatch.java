package com.celcom.day3;

class Vehicle2{
	Vehicle2(){
		
	}
	
}

class Bike2 extends Vehicle2{
	
}

class Car2 extends Vehicle2{
	
}

public class DynamicMethodDispatch {
	public static void main(String args[]) {
		Bike2 bike = new Bike2();
		Vehicle2 vec = new Bike2();
		vec = new Car2();
	}
}
