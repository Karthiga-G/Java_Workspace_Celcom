package Assignment1;

public class Employee {

	String name;
	String title;
	double basesalary;
	double overtimepay;
	double deductions;
	
	Employee(String name, String title, double basesalary, double overtimepay, double deductions) {
		this.name = name;
		this.title = title;
		this.basesalary = basesalary;
		this.overtimepay = overtimepay;
		this.deductions = deductions;
	}
	
	double calculateSalary() {
		return (basesalary + overtimepay - deductions);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("Karthiga", "Trainee", 40000, 5000, 3000);
		System.out.println(emp.calculateSalary());
	}

}
