package com.celcom.day3;

public class thisKeyExample {
	
	String name;
	
	thisKeyExample(){
		this("Karthiga");
	}
	
	thisKeyExample(String name){
		this.name = name;
		this.greeting();
	}
	
	void greeting() {
		System.out.println("Welcome "+name);
	}
	
	public static void main(String args[]) {
		thisKeyExample obj = new thisKeyExample();
	}
}
