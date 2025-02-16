// Write a Java program to sort a given array list.
package Assignment2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercise2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(14);
		list.add(11);
		list.add(13);
		list.add(8);
		
		Collections.sort(list);
		System.out.println(list);
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
