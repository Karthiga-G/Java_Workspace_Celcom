package com.celcom.main;

import com.celcom.pack1.MyClass1;
import com.celcom.pack2.MyClass2;

import java.lang.Math;

public class MainClass {
	static int PI = 20;
	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod3();
		
		System.out.println(Math.PI);
		System.out.println(PI);
	}
}