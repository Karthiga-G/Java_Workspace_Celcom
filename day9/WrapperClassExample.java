package com.celcom.day9;

public class WrapperClassExample {

	public static void main(String[] args) {
		int a = 10;
		Integer obj1 = new Integer(a); //Boxing
		int b = obj1.intValue(); //Un-Boxing
		//the above method is under jdk 1.5. After that it got deprecated
		
		//New method
		Integer obj2 = a; // Auto Boxing
		int c = obj2; //Auto Un-Boxing
	}

}
