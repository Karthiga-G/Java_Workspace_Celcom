package com.celcom.day6;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;
//			int a = Integer.parseInt("Hello");
//			int arr[] = new int[-5];
			System.out.println("Hi");//this won't be executed because of the exception in the previous line
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (NumberFormatException e) { 
			
			System.out.println("NumberFormat Exception");
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySize Exception");
		} catch (Exception e) {
			System.out.println("Global Exception");
		} finally {
			System.out.println("Inside Finally");
		}

		System.out.println("After Exception");
	}

}
