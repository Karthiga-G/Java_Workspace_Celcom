package com.celcom.day3;

public class thisKeyExample1 {
	
	thisKeyExample1(){
		this("Karthiga");
		System.out.println("A");
	}
	
	thisKeyExample1(String name){
		this(10);
		System.out.println("B");
	}
	
	thisKeyExample1(int a){
		System.out.println("C");
	}
	
	public static void main(String args[]) {
		thisKeyExample1 obj1 = new thisKeyExample1();
	}

}
