package com.celcom.day2;

public class InstanceAndStatic {
	int a = 10;
	static int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INSTANCE
		InstanceAndStatic obj1 = new InstanceAndStatic();
		InstanceAndStatic obj2 = new InstanceAndStatic();
		System.out.println("Instance variables: ");
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a = 20;
		System.out.println("After changing value:");
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
		
		//STATIC
		System.out.println("Static variables: ");
		InstanceAndStatic obj3 = new InstanceAndStatic();
		InstanceAndStatic obj4 = new InstanceAndStatic();
		
		System.out.println(obj3.b);//10
		System.out.println(obj4.b);//10
		
		obj3.b = 20;
		System.out.println("After changing value:");
		System.out.println(obj3.b);//20
		System.out.println(obj4.b);//10
		
	}

}
