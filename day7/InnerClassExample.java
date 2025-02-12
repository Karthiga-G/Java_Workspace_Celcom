package com.celcom.day7;

public class InnerClassExample {
	
	//1. Non - static inner class or Instance inner class
	class InnerClass1{
		void myMethod1() {
			System.out.println("Non-Static Inner CLass");
		}
	}
	
	//2. Static inner class
	static class InnerClass2{
		void myMethod1() {
			System.out.println("Static Inner CLass");
		}
	}
	
	void myMethod() {
		//3. Local Inner Class
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
	}
	
	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
		InnerClass1 inner1 = obj.new InnerClass1();
		inner1.myMethod1();
		
		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.myMethod1();
	}

}
