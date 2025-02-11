package com.celcom.day6;

import java.util.Scanner; 


class InvalidAgeException1 extends Exception{
	int age;
	
	InvalidAgeException1(int age){
		this.age = age;
	}
	@Override
	public String toString() {
		return age + " Invalid Age for Voting";
	}
}

public class UserDefinedExceptionParameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		
		if(age>18) {
			System.out.println("Welcome to Vote");
		}
		else {
			try {
				throw new InvalidAgeException1(age);
			} catch (InvalidAgeException1 e) {
				System.out.println(e);
			}
		}
	}

}
