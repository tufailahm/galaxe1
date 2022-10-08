package day3;

class Customer {
	 @Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE CALLED - CUSTOMER");
	}
}
public class GCdemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = c2;
		c3= null;
		Customer c4 = c1;
		c1 = null;
		c4=null;
		c2 = null;
		System.gc();
	}
}
