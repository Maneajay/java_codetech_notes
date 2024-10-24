package com.test.array;

import java.util.Arrays;

public class Demo1 {
public static void main(String[] args) {
	int[] arr= {184,122,153,194,23,2333};
	Arrays.sort(arr);
	System.out.println("min ::"+arr[0]);
	System.out.println("max ::"+arr[arr.length-1]);
	
}
}
