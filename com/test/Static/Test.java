package com.test.Static;

public class Test {
	int a=5;
	static int b=5;
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("non static  =" +test.a++);
		System.out.println(" static  ="+ test.b++);
	
	Test test1 = new Test();
	System.out.println("non static  ="+test1.a++);
	System.out.println(" static  ="+ test1.b++);
	
	Test test2 = new Test();
	System.out.println("non static  ="+test2.a++);
	System.out.println(" static  ="+ test2.b++);
}
}