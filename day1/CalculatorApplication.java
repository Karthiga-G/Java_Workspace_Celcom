package com.celcom.day1;
import java.util.*;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s;
		do {
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enetr second number");
		int num2 = sc.nextInt();
		System.out.println("enetr your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition");
			System.out.println("The sum is "+(num1+num2));
			break;
		case 2:
			System.out.println("Subtraction");
			System.out.println("The difference is " +Math.abs(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication");
			System.out.println("The product is "+(num1*num2));
			break;
		case 4:
			System.out.println("Division");
			System.out.println("The output is "+(num1/num2));
			break;
		default:
			System.out.println("Enter valid input!");
		}
		System.out.println("If you want to continue, Enter 1, else enter 0");
		s = sc.nextInt();
		}while(s == 1);
		sc.close();
	}

}
