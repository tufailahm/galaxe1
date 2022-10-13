package day7;

import java.util.Comparator;

import day4.Product;

public class QOHComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getQuantityOnHand() > o2.getQuantityOnHand()) {
			return 0;
		}
		else 
		{
			return -1;
		}
	}

	

}
