package com.String;

import java.util.Scanner;
public class PrimeNumber {
	static int num;
    static int count=0;
public static void CheckPrime() {
	
	
	for(int i=1;i<=num;i++) {
		
		if(num%i==0)
		{
			count++;
			
		}
	}
	System.out.println(count);
	if(count==2) {
		System.out.println("this is prime number");
		
	}else {
		System.out.println("this is not prime number");
	}
	
	
}
	public static void main(String[] args) {
		//CheckPrime(3);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
			 num =scanner.nextInt();
			 
		PrimeNumber p=new PrimeNumber();
		p.CheckPrime();
	    
	
		}
	


}
