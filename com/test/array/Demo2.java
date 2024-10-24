package com.test.array;

public class Demo2 {
	public static void main(String[] args) {
		int[] arr= {15,6,17,3,7,9,29};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		if (arr[i]<min) {
			min=arr[i];
			
		}
		}
		System.out.println("min element::"+min);
		System.out.println("max element::"+max);
	}

}
