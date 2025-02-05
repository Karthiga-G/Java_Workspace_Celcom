package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {
	public static void main(String[] args) {
		int arr[] = {2, 7, 6, 8, 9, 5};
		Arrays.sort(arr);
		System.out.println("Array values in Ascending order:");
		for(int value:arr) {
			System.out.println(value+" ");
		}
		//Minimum values
		System.out.println("Mininimum value: "+arr[0]);
		System.out.println("Second Mininimum value: "+arr[1]);
		
		//Maximum values
		System.out.println("Maximum value: "+arr[arr.length - 1]);
		System.out.println("Second Maximum value: "+arr[arr.length - 2]);
		
		//Descending order
		System.out.println("Array values in descending order:");
		for(int i=arr.length-1; i>0; i--) {
			System.out.println(arr[i]+" ");
		}
	}
}
