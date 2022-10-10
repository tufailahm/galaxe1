package day4;
public class Tester {
	static int m(int i) {
		System.out.println("APPLE");
		try {
			i++;
			int num = 1 / 0;
			System.out.println("BALL");
		} 
		finally {
			i += 5;
			System.out.println("DOG");
			}
		i++;
		System.out.println("CAT");
		return i;
	}

	public static void main(String[] args) {
		System.out.println(m(0));
		System.out.println("Thanks");
	}
}

//https://codeshare.io/tufail/