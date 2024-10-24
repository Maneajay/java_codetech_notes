package com.test;

public class Demo {
	public static void main(String[] args) {
		int a=20;//primitive data type 
		Integer integer = new Integer(a);
		System.out.println(integer);//autoboxing
		
		int b=integer.intValue();
		System.out.println(b);//unboxing
	}

}
