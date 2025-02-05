package com.celcom.day2;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0, evenCount=0, oddCount=0;
		System.out.println("Initial Values of an array are:");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter 5 values:");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Updated Values of an array are:");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(arr[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("The sum of the updated array is:"+sum);
		System.out.println("The number of even numbers in the updated array is:"+evenCount);
		System.out.println("The number of odd numbers in the updated array is:"+oddCount);		
		sc.close();
	}

}
