package com.Revision;

public class Operators {
	public static void main(String[] args) {
		int a=20;
		int b=23;
		int c =10;
		// assigning operators
		System.out.println((a-b));
		//logical and or operators 
		System.out.println(a<b && b>c);
		System.out.println(a>b || b<c);
		//relational operators 
		int X=a+b;
		System.out.println(X);
		//bitwise opeartion 
		System.out.println(a<b & b>c);
		System.out.println(a>b | b<c);
		//unary operator 
		a++;
		System.out.println(a);
		//shift operator 
		System.out.println(a<<b);
		//teranary operators
		int no=(a<b)?a:b;
		System.out.println(no);
			
	}

}

