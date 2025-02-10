package Assignment1;

public class Dog {
	
	String name;
	String breed;
	
	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	
	void display() {
		System.out.println("The name of the dog is "+name+" an the breed is "+breed);
	}
	
	void setName(String name, String breed) {
		System.out.println("The updated name of the "+breed+" is "+name);
	}
	
	void setBreed(String breed) {
		System.out.println("The updated name of the breed is "+breed);
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Coco", "Pomerian");
		dog1.display();
		
		Dog dog2 = new Dog("Zoe", "German shepherd");
		dog2.display();
		
		dog2.setName("Zoe", "Pomerian");
		dog2.setName("Coco", "German shepherd");
	}

}
