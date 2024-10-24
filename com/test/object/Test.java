package com.test.object;

public class Test {
public static void main(String[] args) {
	Test test =new Test();
	System.out.println(test.getClass().getName());///methods
	System.out.println(test.getClass().getSimpleName());//class name 
	System.out.println("========================================");

    
	Test test1 =new Test();
	Test test2=new Test();
	System.out.println(test.hashCode());
	System.out.println(test1.hashCode());
	System.out.println(test2.hashCode());
	System.out.println("========================================");

}
}
