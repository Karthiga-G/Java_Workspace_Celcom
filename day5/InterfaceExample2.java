package com.celcom.day5;
import java.util.*;

interface Area{
	void calculateArea();
}

interface Perimeter{
	void calculatePerimeter();
}

abstract class Shape implements Area, Perimeter{
	final float pi = 3.14f;
	int radius;
	int length;
	float breadth;
	int height;
	float tri = 0.5f;

	public Shape(int radius) {
		this.radius = radius;
	}
	public Shape(int length, int height) {
		this.length = length;
		this.breadth = height;
	}
	
	public Shape(int length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public abstract void calculateArea();
	public abstract void  calculatePerimeter();
}

class Circle extends Shape{
	
	public Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		System.out.println(pi * radius * radius);
	}
	
	public void calculatePerimeter() {
		System.out.println(2*pi*radius);
	}
}

class Rectangle extends Shape{
	
	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public void calculateArea() {
		System.out.println(length * breadth);
	}
	
	public void calculatePerimeter() {
		System.out.println(length+breadth);
	}
}

class Triangle extends Shape{

	public Triangle(int length, float height) {
		super(length, height);
	}

	public void calculateArea() {
		System.out.println(0.5 * length * height);
	}
	
	public void calculatePerimeter() {
		System.out.println(length+height);
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for circle");
		System.out.println("Enter 2 for rectangle");
		System.out.println("Enter 3 for triangle");
		int userchoice = sc.nextInt();
		if(userchoice == 1) {
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			Circle circle = new Circle(radius);
			circle.calculateArea();
			circle.calculatePerimeter();
		}
		
		else if(userchoice == 2) {
			System.out.println("Enter the length and breadth");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			Rectangle rectangle = new Rectangle(length, breadth);
			rectangle.calculateArea();
			rectangle.calculatePerimeter();
		}
		
		else if(userchoice == 3) {
			System.out.println("Enter the length and height");
			int trilength = sc.nextInt();
			float height = sc.nextFloat();
			Triangle triangle = new Triangle(trilength, height);
			triangle.calculateArea();
			triangle.calculatePerimeter();
		}
		
		else {
			System.out.println("Enter the valid choice!");
		}

	}

}
