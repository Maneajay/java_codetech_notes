package com.demo.scanner;

import java.util.Scanner;

public class Demo {
	public int addNum(int a ,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write the first number :: ");
		int firstnumber =sc.nextInt();
		System.out.println("write the second number ::");
		int secondnumber =sc.nextInt();
		System.out.println("firstNumber ::" +firstnumber);
		System.out.println("secondnumber ::" +secondnumber);
		/*Demo demo=new Demo();
		int addtion =demo.addNum(firstnumber, secondnumber);
		System.out.println("addtion is those two number is ="+addNum);*/
	}
	
	
	

}
