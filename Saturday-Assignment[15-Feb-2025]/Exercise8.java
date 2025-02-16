package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
