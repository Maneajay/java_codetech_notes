package Assigmentprogram;
import java.util.Scanner;

public class Assigment4_2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] marks =new int[5];
		int total =0;
		for(int i=0;i<5;i++) {
			System.out.println(" enter marks of subject" +(i+1)+":");
			marks[i]=scanner.nextInt();
			total+=marks[i];
		}
	double average =total/5;
	System.out.println("total marks >>>"+total);
	System.out.println("average marks >>>"+average);
	
	
	}
}
