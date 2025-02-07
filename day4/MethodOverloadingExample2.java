package com.celcom.day4;

public class MethodOverloadingExample2 {

	void concatenate(int a, int b) {
		System.out.println("Integer concatenation: "+a+""+b);
	}
	
	void concatenate(String a, String b) {
		System.out.println("String concatenation: "+a+""+b);
	}
	
	void concatenate(double a, double b) {
		System.out.println("Double concatenation: "+a+""+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample2 obj2 = new MethodOverloadingExample2();
		obj2.concatenate(10, 20);
		obj2.concatenate("Hey", "Hi");
		obj2.concatenate(10.9, 20.8);
	}

}
