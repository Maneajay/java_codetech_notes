package com.String;
import java .util.Scanner;

class ReverseString1{
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a string");
	String str=scanner.next();
	String Original_str=str;
	String reversestr="";
	
	
	for(int i=str.length()-1;i>=0;i--) {
		
		reversestr =reversestr+str.charAt(i);
}
	if(reversestr.equals(Original_str)) {
		System.out.println("this is palindrome ");
	}
	else {
		System.out.println("this is not palindrome");
	}
	}
}
