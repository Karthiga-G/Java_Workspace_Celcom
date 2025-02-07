package com.celcom.day4;

public class ConstructorOverloadingExample {

	ConstructorOverloadingExample(int a, int b){
		this(10.0, 20.9);
		System.out.println("Integer Addition: "+(a+b));
	}
	ConstructorOverloadingExample(double a, double b){
		this(10L, 20L);
		System.out.println("Double Addition: "+(a+b));
	}
	
	ConstructorOverloadingExample(long a, long b){
		System.out.println("Long Addition: "+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloadingExample obj = new ConstructorOverloadingExample(10, 20);
//		ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample(10.5, 20.6);
//		ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(10L, 20L);
	}

}
