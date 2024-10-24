package com.test.array;

import java.util.Arrays;

public class Demo3 {
public static void main(String[] args) {
	int[] arr= {5,6,2,8,9,1};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println("=====================================");
	
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	
	System.out.println(Arrays.toString(arr));
	System.out.println("=============================================");

	
}
}
