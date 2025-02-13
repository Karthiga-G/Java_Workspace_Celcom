package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1.length());//4
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.toLowerCase()); //java
		System.out.println(s1.toUpperCase()); //JAVA
		
		System.out.println(s1.concat(" World")); //Java World
		System.out.println(s1.replace('a', 'z')); //Jzvz
		System.out.println(s1); //Java
		
		System.out.println(s1.contentEquals("java")); //f
		System.out.println(s1.equalsIgnoreCase("java"));//t
		System.out.println(s1.contains("av")); //t
		System.out.println(s1.startsWith("Ja")); //t
		System.out.println(s1.endsWith("va")); //t
		
		String s2 = "Java World"; // va Wo
		System.out.println(s2.substring(2, 7)); //va World
		System.out.println(s2.substring(2));
	}

}
