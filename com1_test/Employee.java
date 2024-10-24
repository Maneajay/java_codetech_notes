package com1_test;

public class Employee {
	int id =101;
	String name ="ajay";
	String city ="pune";
	
	public Employee addEmployee() {
		 Employee emp =new  Employee();
		 System.out.println(emp);
		 return emp;
	}
	public static void main(String[] args) {
		Employee e =new  Employee();
		e.addEmployee();
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
