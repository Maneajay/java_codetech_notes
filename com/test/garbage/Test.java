package com.test.garbage;

public class Test {
public static void main(String[] args) {
	Demo demo =new Demo();
	demo=null ;// by nullable
	Demo demo1 =new Demo();
	Demo demo2= new Demo();
	demo1 =demo2;// by assigning object
	new Demo();// by anonymous object
	System.gc();
}
}
