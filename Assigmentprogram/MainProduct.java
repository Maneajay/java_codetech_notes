package Assigmentprogram;

public class MainProduct {
public static void main (String[] args) {
	Product product =new Product();
	try {
		int weight =90;
		product.ProductCheck(weight);
	}catch(ProductException e) {
		System.out.println(e.getMessage());
	}
}
}
