package com.celcom.day4;

public class MethodOverloadingExample1 {

	void addition(int a, int b) {
		System.out.println("Integer addition: " +(a+b));
	}
	
	void addition(double a, double b){
		System.out.println("Double addition: "+(a+b));
	}
	
	void addition(long a, long b) {
		System.out.println("Long addition: "+(a+b));
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample1 obj1 = new MethodOverloadingExample1();
		obj1.addition(10, 20);
		obj1.addition(10.90, 11.20);
		obj1.addition(20L, 30L);

	}

}
