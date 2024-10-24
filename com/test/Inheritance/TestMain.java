package com.test.Inheritance;

public class TestMain {
public static void main(String[] args) {
	 X x=new X();
	   System.out.println(x.a);
	   System.out.println(x.b);
	   x.m1();
	   x.m2();
	   System.out.print("============================");
	
	Y y=new Y();
	  System.out.println(y.a);
	  System.out.println(y.b);
	  y.m1();
	  y.m2();
	  System.out.println("=================================");
	
	 X x1=new Y();
		System.out.println(x1.a);
		System.out.println(x1.b);
		x1.m1();
		x1.m2();
		System.out.println("==================================");
	
	 X x2=new X();
	    System.out.println(x2.a);
		System.out.println(x2.b);
		x2.m1();
		x2.m2();
		System.out.println("===================================");
}
}
