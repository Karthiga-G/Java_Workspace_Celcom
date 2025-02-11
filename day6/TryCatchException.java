package com.celcom.day6;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exceptions");

		try {
			int a = 10 / 0;
//			int a = Integer.parseInt("Hello");
//			int arr[] = new int[-5];
			System.out.println("Hi");//this won't be executed because of the exception in the previous line
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			try {
				int a = Integer.parseInt("Hello");
			}
			catch (NumberFormatException o){
				System.out.println("Number format exception inside nested try catch");
			}
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat Exception");
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySize Exception");
		} catch (Exception e) {
			System.out.println("Global Exception");
		}

		System.out.println("After Exception");
	}

}
