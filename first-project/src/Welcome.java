import hr.Employee;
import hr.Customer;

import hr.*;


public class Welcome {
	int num=10;			
	int age=20;
	public void accept() {
		System.out.println("Accept called");
	}
	public void display() {
		accept();
		System.out.println("Display called");
	}
	public static void main(String []abc) {
		System.out.println("Welcome");
		Welcome welcome = new Welcome();
		welcome.display();
		Bye bye = new Bye();
		bye.sayHello();
		Hello hello = new Hello();
		hello.hi();
		Employee e = new Employee();
		e.getEmployeeInformation();
	}
}
class Bye
{
	public void sayHello() {
		System.out.println("Say Hello called ");
	}
	public static void main(String[] args) {
		System.out.println("Bye main called");
	}
}