package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient int eid; //It will make this variable to be protected from serialization and it will show eid = 0 instead of actually showing its real value
//	private int eid; 
	private String ename;
	private int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public String toString() {
		return "Employee [eid="+ eid +", ename=" + ename+", esalary="+esalary+"]";
	}
}

public class SerializationExample{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp_s = new Employee(101, "Karthiga", 5000);
		
		//Serialization
		FileOutputStream fout = new FileOutputStream("D:\\SerializableExampleDoc.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(emp_s);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		
		//De-Serialization
		FileInputStream fin = new FileInputStream("D:\\SerializableExampleDoc.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp_d = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp_d);
	}

}
