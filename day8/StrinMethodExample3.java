package com.celcom.day8;

public class StrinMethodExample3 {

	//Strings are immutable object like array
	//StringBuffers are mutable object
	
	public static void main(String[] args) {
		String s1 = "Java";
		
		s1 = s1.concat(" World");
		System.out.println(s1); //Java World
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append("World");
		System.out.println(sb1);
	}

}
