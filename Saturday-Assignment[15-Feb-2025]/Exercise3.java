package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>(list1);
		System.out.println(list2);

	}

}
