package com.celcom.day5;

interface Interface1{
	int a = 10; //By default, interface variables are public, static, final.
}

interface Interface2{
	int a = 20;
}

interface Interface3 extends Interface1, Interface2{
	void addition();
}

class Addition implements Interface3{
	@Override
	public void addition() {
		System.out.println(Interface1.a + Interface2.a);
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		add.addition();
	}

}
