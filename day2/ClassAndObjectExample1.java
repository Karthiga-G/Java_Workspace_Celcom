package com.celcom.day2;

public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits apple = new Fruits("Red", 10, 200);
		apple.display();
		apple.setPrice(150);
		apple.display();
	}
}
	
class Fruits{
		String color;
		int size;
		int price;
		
		Fruits(String color, int size, int price){
			this.color = color;
			this.size = size;
			this.price = price;
		}
		
		void display() {
			System.out.println("Fruit color: "+color);
			System.out.println("Fruit size: "+size);
			System.out.println("Fruit price: "+price);
		}
		
		void setPrice(int price) {
			this.price = price;
		}
	}
