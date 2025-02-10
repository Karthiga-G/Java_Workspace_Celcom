package Assignment1;

public class Person {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Person name is:"+name);
		System.out.println("Person age is:"+age);
	}
	
	void setName(String name) {
		this.name = name;
		System.out.println("The updated name is: "+name);
	}
	
	void setAge(int age) {
		this.age = age;
		System.out.println("The updated name is: "+age);
	}
	
	public static void main(String[] args) {
		Person person = new Person("Karthiga", 21);
		person.setName("Someone");
		person.setAge(20);
	}
}
