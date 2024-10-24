package com.String;

public class FibonnasiSeries {
public static void checkFibonnasyNum(int count) {
	int a=0;
	int b=1;
	int c=1;
	for(int i=0;i<=count;i++) {
		System.out.println(a);
		a=b;
		b=c;
		c=a+b;
	}
}
public static void main(String[] args) {
	checkFibonnasyNum(10);
}
}
