package Assigmentprogram;
import java.util.Scanner;
public class EmployeeInfo_Variable {
       String fname,lname,city;
       String country="India";
       long mobile;
       public void getUserInput() {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter your first name");
    	   fname=sc.nextLine();
    	   
    	   System.out.println("enter your last name");
    	   lname=sc.nextLine();
    	   
    	   System.out.println("enter your city name");
    	   city=sc.nextLine();
    	   System.out.println("enter your phone  number");
    	   mobile=sc.nextLong();
       }
}
