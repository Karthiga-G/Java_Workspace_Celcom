package com.celcom.day2;

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Karthiga = new Employee(001, "Karthiga", 800000);
		Karthiga.display();
		
		Employee someone = new Employee(002, "Someone", 7000);
		someone.display();
	}

}

class Employee{
	//Variable Declaration
	int eid;
	String ename;
	double esalary;
	
	Employee(int id, String name, double salary) {
		eid = id;
		ename = name;
		esalary = salary;
	}
	
	//Method Declaration
	void display() {
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esalary);
	}
}
