package day7;

abstract class Animal {
	public Animal() {
		System.out.println("Animal cons called");
	}

	public abstract void eat();

	public abstract void drink();

	public void sleep() {
		System.out.println("Animnal sleeps");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Animal a = new Animal() {

			@Override
			public void eat() {
				System.out.println("LEVIN EATS");

			}

			@Override
			public void drink() {
				System.out.println("LEVIN DRINKS");

			}

		};
		a.eat();
		a.drink();
	}

}
