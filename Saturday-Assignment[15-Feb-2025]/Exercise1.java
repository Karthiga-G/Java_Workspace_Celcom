// Write a Java program to search for an element in an array list.

package Assignment2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(list1.contains(n)) {
			System.out.println("The required number is present at index "+list1.indexOf(n)+" in the list");
		}
		else {
			System.out.println("The required number is not in the list");
		}
		
		sc.close();
	}

}
