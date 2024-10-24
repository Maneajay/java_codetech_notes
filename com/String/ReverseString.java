package com.String;
import java.util.Scanner;
public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string ");
		//String str="ajay";
		String str=scanner.next();
		for(int i=str.length()-1;i>=0;i--) {
			char ch =str.charAt(i);
			System.out.print(ch);
		}
	}				
    }


