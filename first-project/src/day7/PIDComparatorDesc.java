package day7;

import java.util.Comparator;

import day4.Product;

public class PIDComparatorDesc implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getProductId() < o2.getProductId()) {
			return 0;
		}
		else 
		{
			return -1;
		}
	}

	

}
