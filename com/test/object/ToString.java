package com.test.object;

public class ToString {
int id;
String employeeName;
String employeeCity;
String employeeEmail;

public static void main(String[] args) {
	ToString string =new ToString();
	string.id=10;
	string.employeeName="ajay";
	string.employeeEmail="pune";
	string.employeeEmail="ajay.com";
	System.out.println(string);
}

@Override
public String toString() {
	return "ToString [id=" + id + ", employeeName=" + employeeName + ", employeeCity=" + employeeCity
			+ ", employeeEmail=" + employeeEmail + "]";
}
}
