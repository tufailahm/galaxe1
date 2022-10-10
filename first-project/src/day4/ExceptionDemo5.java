package day4;

import java.util.Scanner;

public class ExceptionDemo5 {

	int num1, num2, result;
	Scanner scanner = new Scanner(System.in);
	String name;
	public void display() {
		System.out.println("Hi ");
		try {
			Class.forName("com.mysql.jdbc.driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo5 demo1 = new ExceptionDemo5();
		demo1.display();

		System.out.println("Thanks for using my program");
	}
}
