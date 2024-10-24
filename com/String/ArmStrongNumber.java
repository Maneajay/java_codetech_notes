package com.String;
import java.util.Scanner;
public class ArmStrongNumber {
public boolean isArmStrongNumber(int input) {
	int tempvalue= input;
    int reminder =0;
    int sum=0;
    while(input>0) {
    	reminder =input%10;
    	sum=sum+(reminder*reminder*reminder);
    	input=input/10;
    }

    if(sum==tempvalue) 
    return true;
    else
    	return false;
}
public static void main(String[] args) {
	ArmStrongNumber armStrongNumber=new ArmStrongNumber();
	Scanner scanner=new Scanner(System.in);
	System.out.println("enetr the number to chaeck armstrong::");
	int value=scanner.nextInt();
	
	if(armStrongNumber.isArmStrongNumber(value))
		System.out.println(value+"is armstrongnumber");
	else
		System.out.println(value+"is not armstrongnumber");
}


}
