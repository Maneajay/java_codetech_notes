package com.Revision;
import java.util.Scanner;
public class scanner {
public static void multiplication(int no) {
	for(int i=1;i<=10;i++) {
		int c=no*i;
		System.out.println(no+"*"+i+"="+c);
		
	}
}
public static void main(String[] args) {
	System.out.println("enter the number for multiplication>>");
	Scanner a= new Scanner(System.in);
	int x=a.nextInt();
	System.out.println("value" +x);
	multiplication(x);	
}
}
