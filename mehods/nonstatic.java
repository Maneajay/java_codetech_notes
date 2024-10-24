package mehods;

public class nonstatic {
	public void  test() {
		System.out.println("this is not static method");
		
	}
public static void main(String[] args) {
	nonstatic obj=new nonstatic();
	obj.test();
	
	
}
}
