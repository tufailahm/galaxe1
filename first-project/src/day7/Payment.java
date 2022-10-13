package day7;

public class Payment {
	static  Payment p1;

	private Payment() {
		System.out.println("Payment object created");
	}
	public static Payment getPaymentInstance() {
		if(p1 == null)
		{
			p1 = new Payment();
		}
		return p1;
	}
	public void deposit(int amount,String employeeName) {
		System.out.println("INR :"+amount+ "got deposited by :"+employeeName);
	}

}
