package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUnchecked {

	public static void main(String[] args) throws FileNotFoundException {
		//Unchecked Exception
		int a = 10/0;
		int b = Integer.parseInt("Valan");
		int arr[] = new int[-5];
		
		//Checked Exception
		FileReader fr = new FileReader("abc.text");
		
	}

}
