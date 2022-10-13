package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import day4.Product;
import day7.PIDComparatorDesc;
import day7.QOHComparator;

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

		Collections.sort(products);
		System.out.println("Sorted -- based on price-DESC");
		Iterator<Product> productsIterator = products.iterator();
		while (productsIterator.hasNext()) {
			Product temp = productsIterator.next();
			System.out.println(temp);
		}

		System.out.println("Sorted -- based on QOH-ASC");
		Collections.sort(products, new QOHComparator());
		Iterator<Product> productsIterator2 = products.iterator();
		while (productsIterator2.hasNext()) {
			Product temp = productsIterator2.next();
			System.out.println(temp);
		}

		System.out.println("Sorted -- based on Product ID-DESC");
		Collections.sort(products, new PIDComparatorDesc());
		Iterator<Product> productsIterator3 = products.iterator();
		while (productsIterator3.hasNext()) {
			Product temp = productsIterator3.next();
			System.out.println(temp);
		}

		System.out.println("4.Sorted -- based on Product Name-DESC");

		Comparator<Product> pnameComparator = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getProductName().compareTo(o2.getProductName()) > 0)
					return -1;
				else
					return 0;
			}
		};

		StringBuilder s = new StringBuilder();
		Collections.sort(products, pnameComparator);

		Iterator<Product> productsIterator4 = products.iterator();
		while (productsIterator4.hasNext()) {
			Product temp = productsIterator4.next();
			System.out.println(temp);
		}

		
		System.out.println("5.Sorted -- based on Product Name-ASC - Lambdas expression");

		Comparator<Product> pNameAsc = (p1,p2) -> { if (p1.getProductName().compareTo(p2.getProductName()) > 0) return 0; else return -1;};
		
		Collections.sort(products, pNameAsc);

		Iterator<Product> productsIterator5 = products.iterator();
		while (productsIterator5.hasNext()) {
			Product temp = productsIterator5.next();
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		new Demo1_Objects();
	}
}
