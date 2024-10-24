package com.collage;

import java.util.Scanner;

//Main class to implement the menu-driven program
public class testMain {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     IntegerOperationsImpl operations = new IntegerOperationsImpl();

     System.out.println("Enter number of elements:");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter the elements:");
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }

     while (true) {
         System.out.println("\nMenu:");
         System.out.println("1. Sum of elements");
         System.out.println("2. Average of elements");
         System.out.println("3. Difference between Max and Min elements");
         System.out.println("4. Digit-wise sum of a number");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.println("Sum of elements: " + operations.sum(arr));
                 break;
             case 2:
                 System.out.println("Average of elements: " + operations.avg(arr));
                 break;
             case 3:
                 System.out.println("Difference between Max and Min: " + operations.maxMinDifference(arr));
                 break;
             case 4:
                 System.out.print("Enter a number: ");
                 int num = sc.nextInt();
                 System.out.println("Digit-wise sum: " + operations.digitwiseSum(num));
                 break;
             case 5:
                 System.out.println("Exiting program...");
                 sc.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid option! Please choose again.");
         }
     }
 }
}

