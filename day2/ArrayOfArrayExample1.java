package com.celcom.day2;

public class ArrayOfArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Of Array
		//Equal dimensions
		int arr[][]= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("The equal number of dimensions array elements");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//Unequal dimension
		int arr1[][]= {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
		System.out.println("The unequal number of dimensions array elements");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		//Without inner array size
		int arr2[][]= new int[3][];
		arr2[0]= new int[] {1, 2, 3, 4};
		arr2[1] = new int[] {5, 6};
		arr2[2] = new int[] {7, 8, 9};
		
		System.out.println("The unequal number of dimensions array elements Without giving inner array size");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
