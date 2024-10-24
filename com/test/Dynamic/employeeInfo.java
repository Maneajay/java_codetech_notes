package com.test.Dynamic;
import java.util.Scanner;
public class employeeInfo {
	public static void getUserInput() {
		System.out.println("get the  inputs from user ");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the employee id :: ");
		int  employeeId=scanner.nextInt();
        
        System.out.println("enter the employee name :: ");
		String employeeName=scanner.next();
       
		
		System.out.println("enter the employee city :: ");
		String employeeCity=scanner.next();
		
		
		
		employee emp=new employee();
		emp.setEmployeeId(employeeId);
		emp.setEmployeeName(employeeName);
		emp.setEmployeeCity(employeeCity);
		
		
		System.out.println("employee id ::"+ emp.getEmployeeId());
		System.out.println("employee name ::"+ emp.getEmployeeName());
		System.out.println("employee city ::"+ emp.getEmployeeCity());
		
	}
public static void main(String[] args) {
	getUserInput();
}
}
