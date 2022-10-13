
public class Hello {
	int i=100;
	public void hi() {
		System.out.println("This is hi from hello method");
	}
}
class Customer extends Hello
{
	int price;
	public void display(Customer p) {
		this.price = 90;
		p.price = 908;
		System.out.println(i);
		Hello h = new Hello();
		System.out.println(h.i);
	}
}
class Employee {
	public void display() {
		Hello h = new Hello();
		Customer c = new Customer();
		c.display(c);
		System.out.println(h.i);
	}
}