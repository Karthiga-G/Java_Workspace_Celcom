package com.celcom.day4;

class Animal{
	void move() {
		System.out.println("Cannot define");
	}
	
	void eat() {
		System.out.println("Cannot define");
	}
}

class Cat extends Animal{
	void move() {
		System.out.println("Cat will move by walk");
	}
	void eat() {
		System.out.println("Cat will eat Rat");
	}
}

class Parrot extends Animal{
	void move() {
		System.out.println("Parrot will move by fly");
	}
	void eat() {
		System.out.println("Parrot will eat fruits");
	}
}

class Fish extends Animal{
	void move(){
		System.out.println("Fish will swim");
	}
	void eat() {
		System.out.println("Fish will eat small fish");
	}
}

public class MethodOverridingExample1 {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Cat();
		animal.move();
		animal.eat();
		
		System.out.println();
		
		animal = new Parrot();
		animal.move();
		animal.eat();
		
		System.out.println();
		
		animal = new Fish();
		animal.move();
		animal.eat();
	}
}
