package com.String;
import java.util.Scanner;
public class stringajay {
public static void main (String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a valid string");
	String str=scanner.next();
	for(int i=str.length()-1; i>=0;i--) {
		System.out.println(i);
		char ch=str.charAt(i);
		System.out.println(ch);
		
		
	}
	

}
}
