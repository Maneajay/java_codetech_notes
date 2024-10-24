package Assigmentprogram;

public class Product {
public void ProductCheck(int weight)throws ProductException{
	if(weight<100) {
		throw new ProductException("procut weight is less than 100 units");
		
	}else {
		System.out.println("product weight is sufficent:");
	}
}
}
