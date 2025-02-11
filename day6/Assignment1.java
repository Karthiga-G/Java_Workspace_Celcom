package com.celcom.day6;

import java.util.*;

class DuplicateElementException extends Exception{
	@Override
	public String toString() {
		return "Duplicate element exists in the given array";
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {10, 20, 20, 30, 40, 40, 50};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]!=arr[j]) {
					System.out.println("Unique");
				}
				else {
					try {
						throw new DuplicateElementException();
					} catch (DuplicateElementException e) {
						System.out.println(e);
					}
					return;
				}
			}
		}
		System.out.println("DUplicate not exists");
		sc.close();
	}

}
