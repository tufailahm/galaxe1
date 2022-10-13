package day7;

public class Bank {

	public static void main(String[] args) {
		Payment manogna = Payment.getPaymentInstance();
		manogna.deposit(32987,"Manogna");
		Payment tarun =Payment.getPaymentInstance();
		tarun.deposit(78000,"Tarun");
		Payment vamsi = Payment.getPaymentInstance();
		vamsi.deposit(78000,"Vamsi");
	}
}
