package com.celcom.day2;

public class ArrayExample1 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
		System.out.println("Array Length is "+arr.length);
		System.out.println("Array Elements: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("The sum of the array elements is: "+sum);
		System.out.println();
		System.out.println("USING ENHANCED FOR LOOP");
		System.out.println("The values of the array are: ");
		for(int value:arr) {
			System.out.println(value);
		}
	}
}
