package com.Revision;
import java.util.Scanner;
public class Scanneradd {
public int addition(int a,int b) {
	int c =a+b;
	return c;
}
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("eneter the first numnber");
	int firstNumber =scanner.nextInt();
	
	System.out.println("eneter the second numnber");
	int secondNumber =scanner.nextInt();
	
	System.out.println("first Number>>>"+firstNumber);
	System.out.println("second Number>>>"+secondNumber);
	Scanneradd a=new Scanneradd();
	int add=a.addition(firstNumber, secondNumber);
	System.out.println(add);
}
}
