package day2;

class Customer
{
	int customerId;
	String customerName;
	int billAmount;
	{
		System.out.println("GALAXE");
	}
	static {
		System.out.println("STATIC BLOCK");
	}
	public Customer() {
		System.out.println("Customer constructor called");
		customerId = -1;
		customerName = "Not Available";
		billAmount = 100;
	}
	public void display() {
		System.out.println("Customer Id :"+customerId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Customer Bill Amount :"+billAmount);
	}
	public Customer(int customerId, String customerName, int billAmount) {
		System.out.println("Customer 3 parameter constructor called");
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
	}
	public Customer(int customerId, int billAmount) {
		this();
		this.customerId = customerId;
		this.billAmount = billAmount;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
			System.out.println("MAIN CALLED");
			Customer ahmed = new Customer(98,"Tufail",98700);
			Customer meghana = new Customer();
			Customer sampath = new Customer(123,566);
			System.out.println("#####Ahmed details :");
			ahmed.display();
			System.out.println("######Meghana details :");
			meghana.display();
			System.out.println("######Sampath details :");
			sampath.display();
			
			new Customer().display();
	}
}







