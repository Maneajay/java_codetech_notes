package com.Revision;

public class Wrapperclass {
	public static void main(String[] args) {
		char a='s';
		Character b =new Character(a);
		System.out.println(b);
		char c=b.charValue();
		System.out.println(c);
	}
}