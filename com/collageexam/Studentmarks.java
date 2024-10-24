package com.collageexam;
import java.util.Scanner;

class Student {
	int roll_no;
	String name;
	int m1,m2,m3;
	float percentage;
	Student(int roll_no,String name,int m1,int m2,int m3){
		this.roll_no=roll_no;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.percentage=(m1+m2+m3)/3;
	}
	void display(){
		System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Percentage: " + percentage);
	}
}
public class Studentmarks{
	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter how many student");
	int n=scanner.nextInt();
	Student[] student=new Student[n];
	float maxpercentage=0;
	for(int i=0;i<=n;i++) {
		System.out.print("\nRoll No: ");
        int rollno = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Marks 1: ");
        int m1 = scanner.nextInt();
        System.out.print("Marks 2: ");
        int m2 = scanner.nextInt();
        System.out.print("Marks 3: ");
        int m3 = scanner.nextInt();

        student[i] = new Student(rollno, name, m1, m2, m3);
        maxpercentage = Math.max(maxpercentage, student[i].percentage);
	}
	System.out.println("\nStudent(s) with the highest percentage:");
    for (Student s : student) {
        if (s.percentage == maxpercentage) s.display();
	}
		scanner.close();
	}	
}
    