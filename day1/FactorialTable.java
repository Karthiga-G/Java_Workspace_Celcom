package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i+"!= "+factorial(i));
		}
		sc.close();
	}
	public static int factorial(int n) {
		int fact= 1;
		while(n!=0) {
			fact= fact*n;
			n=n-1;
		}
		return fact;
	}


}
