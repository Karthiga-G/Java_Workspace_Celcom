package com.celcom.day6;

class NoVowelException extends Exception{
	@Override
	public String toString() {
		return "No vowels";
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		String s = "Hll";
		if(containsVowels(s)) {
			System.out.println("The string contains vowels.");
        } else {
        	try {
				throw new NoVowelException();
			} catch (NoVowelException e) {
				System.out.println(e);
			}
			return;        
			}
	}

	public static boolean containsVowels(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true; 
            }
        }
        return false; 
    }
}
