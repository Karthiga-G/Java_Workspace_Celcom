package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(14);
		list.add(11);
		list.add(13);
		list.add(8);
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i=(list.size())-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
	}

}
