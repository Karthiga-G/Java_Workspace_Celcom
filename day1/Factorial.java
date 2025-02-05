package com.celcom.day1;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n= sc.nextInt();
		int fact= 1;
		while(n!=0) {
			fact= fact*n;
			n=n-1;
		}
		System.out.println("the output is: "+fact);
		sc.close();
	}

}
