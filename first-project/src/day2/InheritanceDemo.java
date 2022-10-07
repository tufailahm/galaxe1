package day2;

class Vehicle{
	int price=100000;
	int noOfTyres=0;
	public void start() {
		System.out.println("Vehicle started");
	}
	public void stop() {
		System.out.println("Vehicle stopped");

	}
}
class Car extends Vehicle
{
	int price=300000;
	String acType;
	public void startAC() {
		int price = 4000000;
		System.out.println("Local price :"+price);
		System.out.println("car price"+this.price);
		System.out.println("Vehicle price :"+super.price);
	}
}
class Hyundai extends Car {
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
			Car c = new Car();
			c.start();
			c.startAC();
			c.stop();
	}
}
