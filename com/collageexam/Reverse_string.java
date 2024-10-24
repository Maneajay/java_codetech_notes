package com.collageexam;
import java.util.Scanner;
public class Reverse_string {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);  // Initialize Scanner object

	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();  // Read the input string

	        while (true) {
	            // Display menu options
	            System.out.println("\nMENU:");
	            System.out.println("1. Reverse the string");
	            System.out.println("2. Check the length of the string");
	            System.out.println("3. Print alternate characters of the string");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();  // Read the user's choice

	            switch (choice) {
	                case 1:  // Reverse the string
	                    String reversed = "";
	                    for (int i = str.length() - 1; i >= 0; i--) {
	                        reversed += str.charAt(i);
	                    }
	                    System.out.println("Reversed string: " + reversed);
	                    break;

	                case 2:  // Display length of the string
	                    System.out.println("Length of the string \"" + str + "\" is: " + str.length());
	                    break;

	                case 3:  // Print alternate characters
	                    System.out.println("Alternate characters: ");
	                    for (int i = 0; i < str.length(); i += 2) {
	                        System.out.print(str.charAt(i));
	                    }
	                    System.out.println();  // Move to next line after printing
	                    break;

	                case 4:  // Exit the program
	                    System.out.println("Exiting the program.");
	                    scanner.close();  // Close scanner before exiting
	                    System.exit(0);

	                default:  // Handle invalid input
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
