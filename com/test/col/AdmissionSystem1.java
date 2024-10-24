// name :ajay pandurang mane sybsc(cs) div:b 225484
package com.test.col;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double percentage;

    Student(int registrationId, String name, double percentage) {
        this.registrationId = registrationId;
        this.name = name;
        this.percentage = percentage;
    }
}

public class AdmissionSystem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (true) {
            try {
                System.out.print("Enter the number of students: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a positive integer.");
            }
        }

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter registration ID for student " + (i + 1) + ": ");
                int registrationId = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter name for student " + (i + 1) + ": ");
                String name = scanner.nextLine();

                System.out.print("Enter 12th percentage for student " + (i + 1) + ": ");
                double percentage = Double.parseDouble(scanner.nextLine());

                if (percentage < 0 || percentage > 100) {
                    throw new IllegalArgumentException("Percentage must be between 0 and 100.");
                }

                students[i] = new Student(registrationId, name, percentage);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter the correct data type.");
                i--; // Decrement i to re-enter details for the current student
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--; // Decrement i to re-enter details for the current student
            }
        }

        System.out.println("\nStudent Details (As Entered):");
        displayStudents(students);

        Arrays.sort(students, (s1, s2) -> Double.compare(s2.percentage, s1.percentage));

        System.out.println("\nStudent Details (Merit-wise):");
        displayStudents(students);

        scanner.close();
    }

    public static void displayStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Registration ID: " + student.registrationId +
                    ", Name: " + student.name +
                    ", 12th Percentage: " + student.percentage);
        }
    }
}
