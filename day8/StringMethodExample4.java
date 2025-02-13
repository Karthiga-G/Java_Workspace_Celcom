package com.celcom.day8;
// == vs. equals()

public class StringMethodExample4 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3.contentEquals(s4));
		System.out.println(s3 == s4);
		System.out.println(s3.hashCode() == s3.hashCode());
	}

}
