package mehods;

public class static_methods {
	public static void test(){
		System.out.println("this is a static method");
	}
	public static void main(String[] args) {
		static_methods.test();
		static_methods obj=new static_methods();
		obj.test();
		
		
		
	}

}
