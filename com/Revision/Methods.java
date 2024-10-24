package com.Revision;

public class Methods {
	int id =101;
	String name ="ram";
	String city ="pune";
	public Methods addEmployee() {
		Methods emp =new Methods();
		System.out.println(emp);
		return emp;
	}
@Override
	public String toString() {
		return "Methods [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
public  static void main(String[] args) {
	Methods m = new Methods();
	m.addEmployee();
}
}
