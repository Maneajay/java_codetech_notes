package com.test.oops;

public class Encapuslation_Employee {
	private int Salary;
public int getSalary() {
		return Salary;
	}

	public void setSalary(int sal) {
		if(sal>0) {
			Salary=sal;
		}else {
			Salary=0;
	}
	}
	
	public static void main(String[] args) {
		Encapuslation_Employee emp =new Encapuslation_Employee();
		emp.setSalary(500);
		System.out.println(emp.getSalary());
	}

}
