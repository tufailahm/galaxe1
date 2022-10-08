package day3;

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
interface Radio {
		int frequency = 90;
		void scanChannels();
}
class Car extends Vehicle implements MusicSystem,Radio
{
	int price=300000;
	String acType;
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	public void startAC() {
		int price = 4000000;
		System.out.println("Local price :"+price);
		System.out.println("car price"+this.price);
		System.out.println("Vehicle price :"+super.price);
	}
	@Override
	public void playMusic() {
		
		
	}
	@Override
	public void scanChannels() {
		// TODO Auto-generated method stub
		
	}
}
class Bike extends Vehicle
{
	@Override
	public void start() {
		System.out.println("Bile Started");
	}
}
class Hyundai extends Car {
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
			Car c = new Car();
			c.start();
			c.scanChannels();
			c.startAC();
			c.stop();
	}
}
