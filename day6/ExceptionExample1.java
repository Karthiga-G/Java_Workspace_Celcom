package com.celcom.day6;

public class ExceptionExample1 {

	public static void main(String[] args) {
		System.out.println("Before execution");
		//int a = 10/0;
		//int arr[] = new int[-5];
		int arr[] = {10, 20, 30};
		System.out.println(arr[3]);
		
		int a = Integer.valueOf("ABC");
		
		ExceptionExample1 o = (ExceptionExample1) new Object();
		
		System.out.println("After Execution");
	}

}
