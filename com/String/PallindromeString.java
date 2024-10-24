package com.String;
import java.util.Scanner;
public class PallindromeString {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string :: ");
		String str =scanner.next();
		String original_str=str;
		String reversestr="";
		for(int i=str.length()-1;i>=0;i--) {
			reversestr =reversestr+str.charAt(i);
		}
if(reversestr.equals(original_str)) {
	System.out.println("this is palindromr string");
	
}else {
	System.out.println("this is not pallindrome string ");
}
}
}