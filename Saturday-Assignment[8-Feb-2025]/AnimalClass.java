package Assignment1;

public class AnimalClass {
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.makeSound();
		
	}
}

class Animal {
	public void makeSound() {
		System.out.println("From parent class");
	}
}

class Dog1 extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Bark!");
	}
}
