package day4;

public class ProductApp {

	public static void main(String[] args) {
		Product product1;
		try {
			product1 = new  Product(199,"Bottle", 40,10);
			System.out.println(product1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
