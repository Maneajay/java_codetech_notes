package Assigmentprogram;

public class Assigment10 {
	static int getReverseNumber(int num) {
		int reverse =0;
		while(num !=0) {
			reverse=reverse*10 +num%10;
			num=num/10;
			
		}
		return reverse;
		
	}

	public static void main(String[] args){
		int reverse =getReverseNumber(245);
		System.out.println(reverse);
		
	}
}
