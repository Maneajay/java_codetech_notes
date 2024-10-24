package com.test.Static;

public class test2 {
	void x1() {
		System.out.println("this is non staic method.....");
		x2();
	}

	void x2() {
    System.out.println("this is static method.....");
  
}
public static void main(String[] args) {
	test2 Test2=new test2();
	Test2.x1();
}
}

