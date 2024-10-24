package com.collage;

public class IntegerOperationsImpl {
	// Method to calculate sum of an array
    public int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Method to calculate average of an array
    public double avg(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to calculate difference between max and min elements of an array
    public int maxMinDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return max - min;
    }

    // Method to calculate digit-wise sum of a number
    public int digitwiseSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

