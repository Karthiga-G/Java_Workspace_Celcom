package Assignment2;

import java.util.LinkedList;
import java.util.List;

public class Exercise10 {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println("The elements of Linked list 1:");
		System.out.println(list1);
		
		System.out.println("The elements of Linked list 2:");
		List<Integer> list2 = new LinkedList<>(list1);
		System.out.println(list2);
	}

}
