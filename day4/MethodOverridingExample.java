package com.celcom.day4;

class SuperClass{
	void myMethod() {
		System.out.println("I am from super class");
	}
}

class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("I am from sub class");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.myMethod();
		SuperClass obj1 = new SuperClass();
		obj1.myMethod();
		SuperClass obj2 = new SubClass();
		obj2.myMethod();
	}

}
