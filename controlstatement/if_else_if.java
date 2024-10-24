package controlstatement;

public class if_else_if {
public static void main (String[] args) {
	int marks=45;
	if(marks>=35 && marks<=40) {
		System.out.println("you are passed the given exam");
	}else if(marks>=40 && marks<=60) {
		System.out.println("youre grade is D");
	}else if (marks>=60 && marks<=80) {
		System.out.println("your grade is b");
	}else if (marks>=80 && marks<=100) {
		System.out.println("youre grade is a");
	}else {
		System.out.println("youre input is incorrect");
	}
}
}
