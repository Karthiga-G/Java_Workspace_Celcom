package Assignment1;

import java.util.Scanner;

public class Circle {

	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	void calculateArea() {
		System.out.println(3.14*radius*radius);
	}
	
	void calculateCircumference() {
		System.out.println(2*3.14*radius);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		Circle circle = new Circle(radius);
		System.out.println("The area is: ");
		circle.calculateArea();
		System.out.println("The circumference is: ");
		circle.calculateCircumference();
		
		sc.close();
	}
}
