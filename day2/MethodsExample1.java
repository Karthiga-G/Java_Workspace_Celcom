package com.celcom.day2;

public class MethodsExample1 {
	void m1() {
		System.out.println("Instance method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExample1 obj = new MethodsExample1();
		obj.m1();
		MethodsExample1.m2();
	}

}
