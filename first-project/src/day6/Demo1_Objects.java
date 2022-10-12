package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day4.Product;

public class Demo1_Objects {

	List<Product> products;
	
	public Demo1_Objects() {
		products = new ArrayList<Product>();
		
		Product product1 = new Product(331, "Laptop", 340, 98000);
		Product product2 = new Product(1212, "Pendrive", 821, 125);
		Product product3 = new Product(8565, "Bottle", 765, 722);
		Product product4 = new Product(43, "Watch", 12, 9878);
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(new Product(523, "Marker", 8700, 87));
		
		
		Iterator<Product> productsIterator = products.iterator();
		
		while(productsIterator.hasNext()) {
			Product temp = productsIterator.next();
			System.out.println(temp);
		}
		
	
	}

	public static void main(String[] args) {
		new Demo1_Objects();
	}
}
