package Assignment1;

import java.util.Scanner;

public class Rectangle {

	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int calculateArea() {
		return (width*height);
	}
	
	int calculatePerimeter() {
		return (2*(width+height));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width of the rectangle");
		int width = sc.nextInt();
		System.out.print("Enter the height of the rectangle");
		int height = sc.nextInt();
		
		Rectangle rect = new Rectangle(width, height);
		System.out.println("The area of the rectangle is "+rect.calculateArea());
		System.out.println("The perimeter of the rectangle is "+rect.calculatePerimeter());
		
		sc.close();
	}

}
