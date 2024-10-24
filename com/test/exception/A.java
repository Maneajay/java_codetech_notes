package com.test.exception;

public class A {
	 public static void main(String[] args) {  
	        int i=50;  
	        int j=0;  
	        int data;  
	        try  
	        {  
	        	System.out.println("try block start ");
	        data=i/j; //may throw exception   
	        System.out.println("try block end ");
	        }  
	            // handling the exception  
	        catch(Exception e)  
	        {  
	             // resolving the exception in catch block  
	            System.out.println(e);
	        	System.out.println("cache block end ");
	            
	        	System.out.println(i/(j+2));  
	        	System.out.println(i+j);
	            
	        }  
	    }  
	}  

