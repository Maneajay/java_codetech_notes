package com.Revision;

public class Methods1 {
	int id =101;
	String name ="ajay";
	String city="pune";
	public Employee addEmployee() {
		Employee emp =new Employee();
		return emp;
	}
public static void main(String[] args) {
	Employee e =new Employee ();
	e.addEmployee();
}
@Override
public String toString() {
	return "Methods1 [id=" + id + ", name=" + name + ", city=" + city + "]";
}
}

