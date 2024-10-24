package com.demo.scanner;

import java.util.Scanner;

public class student {
	public static void getstudentInfo(String name) {
		System.out.println(name);
	}
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("pass the student name ::");
	 String name =scanner.next();
	 getstudentInfo("student  name is ="+ name);
 }
}
