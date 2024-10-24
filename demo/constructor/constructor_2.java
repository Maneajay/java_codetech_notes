package demo.constructor;

public class constructor_2 {
int id;
String name;
String city;
public  constructor_2(int userId,String userName,String userCity) {
	id=userId;
	name=userName;
	city=userCity;
	System.out.println(id);
	System.out.println(name);
	System.out.println(city);
}
public static void main(String[] args) {
	constructor_2 a=new constructor_2(10,"ajay","pune");
	
	
}
}
