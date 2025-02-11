package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyExample {

	static void m1() throws FileNotFoundException{
		FileReader f = new FileReader("test.txt");
	}
	
	static void m2() {
		try {
			m1();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {		
		
	}

}
