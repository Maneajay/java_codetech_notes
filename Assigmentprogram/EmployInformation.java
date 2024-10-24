package Assigmentprogram;

public class EmployInformation {

	public static void getStudentInformation() {
		EmployeeInfo_Variable s =new EmployeeInfo_Variable();
		s.getUserInput();
		System.out.println("your first name is "+s.fname);
		System.out.println("your last name is "+s.lname);
		System.out.println("your city name is "+s.city);
		System.out.println("your mobile name is "+s.mobile);
		System.out.println("your country name is "+s.country);
	}
	
	public static void main(String[] args) {
		getStudentInformation();
	}
}
