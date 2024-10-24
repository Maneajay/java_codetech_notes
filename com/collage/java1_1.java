package com.collage;
import java.util.Scanner;
public class java1_1 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter a first number");
	int a=scanner.nextInt();
	System.out.println("enter a second number");
	int b=scanner.nextInt();
	while(true) {
		System.out.println("\n 1:addition of two number \n 2:maximum of two number \n3:multipliaction of two number \4:exit \n enter your choice ");
		int ch=scanner.nextInt();
		switch(ch)
		{
		case 1:int sum= a+b;
		System.out.println("addition of two number"+"a" +"b" +sum);
		break;
		case 2: System.out.println("multipliaction of two number"+"+a" "and" "+b" "is" + ((a>b) ?a:b) );
		break;	
		case 3: System.out.println("multiliaction of two number");
		for(int i=1;i<=10;i++) {
			System.out.println("a" + "*" +"b" +"="+i);
		}
		break;
		default: System.exit(0);
		}
	}
	
}
}
