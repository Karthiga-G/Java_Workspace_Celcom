package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		int i=0;
		for(String s : list) {
			System.out.println("The element at position "+i+" is "+s);
			i++;
		}
	}
}
