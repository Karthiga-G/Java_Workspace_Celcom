package com.celcom.day4;

final class Animal1{
	String msg = getMessage();
	
	final String getMessage() {
		return "A";
	}
}
//gives error after changing class and methods to final

class Cat1 extends Animal1{
	String getMessage() {
		return "B";
	}
}

public class finalKeyExample {

	public static void main(String[] args) {
		Animal1 animal = new Cat1();
		System.out.println(animal.msg);
	}

}
