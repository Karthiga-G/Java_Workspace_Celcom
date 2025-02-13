package com.celcom.day8;

public class StringMethodExample2 {
	public static void main(String[] args) {
		String s1 = "Java";
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println();
		
		char ch[] = s1.toCharArray();
		for(char c: ch) {
			System.out.println(c);
		}
		
		String s2 = "Welcome to Java Programming";
		s2.split(" ");//by default, split() method will produce an array of words due to whitespace based splitting
		
		for(String s: temp) {
			System.out.println(s);
		}
	}
}