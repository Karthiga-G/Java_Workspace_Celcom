package com.celcom.day3;

public class MobileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile samsung = new Mobile("Samsung", "black", 30000);
		Mobile moto = new Mobile("Moto", "grey", 10000);
		
		samsung.display();
		moto.display();
		moto.setPrice(9000);
		
	}

}

class Mobile{
	String brand;
	String color;
	int price;
	
	Mobile(String brand,String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void display() {
		System.out.println("The brand is "+brand);
		System.out.println("The color is "+color);
		System.out.println("The price is "+price);
	}
	
	void setPrice(int price) {
		this.price = price;
		System.out.println("The new price is "+price);
	}
	
}