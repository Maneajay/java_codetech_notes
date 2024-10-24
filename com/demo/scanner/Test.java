package com.demo.scanner;
import java.util.Scanner;

public class Test {
	public static void multiplication(int no) {
		for(int i=1; i<= 10; i++) {
			int c =no*i;
			System.out.println(no + "*" +i + " =" + c);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("the number is ::");
		int num =scanner.nextInt();
		multiplication(num);
		
	}

}
