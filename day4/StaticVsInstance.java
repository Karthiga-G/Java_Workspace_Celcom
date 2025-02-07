package com.celcom.day4;

public class StaticVsInstance {

	StaticVsInstance(){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instance block");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	public String toString() {
		return "To String";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Block");
		StaticVsInstance obj = new StaticVsInstance();
		System.out.println(obj);
	}

}
