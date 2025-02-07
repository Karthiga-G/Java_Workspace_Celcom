package com.celcom.day4;

class Animal1{
	String msg = getMessage();
	
	String getMessage() {
		return "A";
	}
}

class Cat1 extends Animal1{
	String getMessage() {
		return "B";
	}
}

public class MethodOverridingExample2 {

	public static void main(String[] args) {
		Animal1 animal = new Cat1();
		System.out.println(animal.msg);
	}

}
