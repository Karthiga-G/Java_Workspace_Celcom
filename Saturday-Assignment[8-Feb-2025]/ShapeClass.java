package Assignment1;

import java.util.Scanner;

public class ShapeClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape1 shape = new Shape1();
		shape.getArea();
		
		System.out.println("Enter the width of the rectangle");
		int width = sc.nextInt();
		System.out.println("Enter the length of the rectangle");
		int length = sc.nextInt();
		Shape1 rect = new Rectangle1(width, length);
		rect.getArea();
		
		sc.close();
	}
}

class Shape1{
	
	void getArea() {
		System.out.println("This statemnet is from Shape class");
	}
}

class Rectangle1 extends Shape1{
	
	int length;
	int breadth;
	
	Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void getArea() {
		System.out.println("The area of the rectangle is: "+(length * breadth));
	}
}