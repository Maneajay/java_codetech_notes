package com.String;
import java.util.Scanner;
public class PallindromeNumber {
     public static void main(String[] args) {
    	Scanner scanner= new Scanner(System.in);
    	System.out.println("eneter the number");
    	int num=scanner.nextInt();
    	int orignal= num;
    	int rev=0;
    	while(num !=0) {
    		rev=rev*10+ num%10;
    		num=num/10;

    	}
    if(orignal==rev) {
    	System.out.println("this is palindromr number");
    	
    }else {
    	System.out.println("this is not pallindrome ");
    }
     }
}
