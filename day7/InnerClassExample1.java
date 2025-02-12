package com.celcom.day7;

interface MyInterface {
	void display();
}

public class InnerClassExample1 implements MyInterface{

	public void display() {
		System.out.println("Anonymous Inner Class");
	}
	
	public static void main(String[] args) {
		InnerClassExample1 obj = new InnerClassExample1();
		obj.display();
		
		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Display by anonymous class");
			}
		};
		
		obj1.display();
		
		MyInterface obj2 = () -> {System.out.println("Display by lambda expression"); int a = 10; System.out.println(a);};
		obj2.display();
	}

}
