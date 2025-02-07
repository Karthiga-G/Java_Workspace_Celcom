package com.celcom.day4;

import java.util.*;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		for(int i=1; i<=(n/2)+1; i++) {
			if(((i-1)*i) == n) {
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("Pronic Number");
		}
		else {
			System.out.println("Not a Pronic Number");
		}
	}
}
