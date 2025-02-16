package Assignment2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element's position in the list:");
		int n = sc.nextInt();
		System.out.println("The element at index "+n+" is "+ list.get(n));
		sc.close();
	}

}
