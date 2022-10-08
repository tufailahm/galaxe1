package day3;
//abstract class
abstract class Animal {
	public Animal() {
		System.out.println("Animal cons called");
	}
	 public abstract void eat() ;
	 public abstract void drink() ;

	 public void sleep() {
		 System.out.println("Animnal sleeps");
	 }
}

abstract class Cat extends Animal {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
class Tiger extends Cat
{
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
	
}


//concerete 
class Men extends Animal {
	public Men() {
	System.out.println("Men cons");
	}
	@Override
	public void eat() {
		System.out.println("Men eats veg and non-veg");
	}
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
}
class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats meats");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
}
public class Client {
	public static void main(String[] args) {
		Men m = new Men();
		m.eat();
		m.sleep();
		Dog d = new Dog();
		d.eat();
		d.sleep();
		
		System.out.println("=============Another way ");
		
		Animal a = new Men();
		a.eat();
		a.sleep();
		a = new Dog();
		a.eat();
		a.sleep();
	}
}
class Food
{
	
}
class Pizza extends Food {
	
}
class Veg extends Food {
	
}