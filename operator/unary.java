package operator;

public class unary {
	public static void main(String[] args) {
		int a =5;
		int b=4;
		a++;
		System.out.println(a);
		b--;
		System.out.println(b);
		int no=(a>b)?a:b;
		System.out.println("no is =n" + no);//ternary operator;
		System.out.println(a<<2);
		System.out.println(a>>7);
	}

}
