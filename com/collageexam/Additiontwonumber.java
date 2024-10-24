 package com.collageexam;
import java.util.Scanner;
public class Additiontwonumber {
public static void main(String[] args0) {
	int choice = 0;
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter first number");
	int a=scanner.nextInt();
	System.out.println("enter a second number");
	int b=scanner.nextInt();
	while(true) {
	System.out.println("MENU PROGRAM : \n1:Addition of two number \n2:maximum of two number \n3:multiplication of two number \n4: exit \n enter your choice");
String c=scanner.next();
switch(choice) {
case 1:
	
	int m=(a+b);
break;
case 2:
	System.out.println("maximum of two number:"+(a>b? a:b));
	break;
case 3:
	for(int i=0;i<=10;i++) {
		System.out.println("multpication of two number:"+ a + "*" + i +"=" + (a*i) );
		break;
	}
default:
			System.out.println("invalid input");
			
	}
System.exit(0);
	}
}

}

