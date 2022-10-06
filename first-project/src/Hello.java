
public class Hello {
	int i=100;
	public void hi() {
		System.out.println("This is hi from hello method");
	}
}
class Customer extends Hello
{
	public void display() {
		System.out.println(i);
		Hello h = new Hello();
		System.out.println(h.i);
	}
}
class Employee {
	public void display() {
		Hello h = new Hello();
		System.out.println(h.i);
	}
}