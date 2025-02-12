package com.celcom.main;

import java.lang.Math;

//static import
import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class AccessingElements {
	static int a = 20;
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(PI);//after static import
		System.out.println(a);
		
		out.println(Math.PI);
		
		int a = parseInt("ABC");
	}
}