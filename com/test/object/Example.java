package com.test.object;

public class Example {
int emplId;
String emplName;
public static void main(String[] args) {
	Example example =new Example();
	example.emplId=101;
	example.emplName="ashok";
	
	Example example1 =new Example();
	example1.emplId=102;
	example1.emplName="ajay";
	
	example =example1;
	System.out.println(example.equals(example1));
}
}
