package day4;

import java.util.Scanner;

public class ExceptionDemo3 {

	int num1, num2, result;
	Scanner scanner = new Scanner(System.in);
	String name;
	public void display() {
		System.out.println("Hi ");
		System.out.println("The length of name is :" + name.length());
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo3 demo1 = new ExceptionDemo3();
		demo1.display();

		System.out.println("Thanks for using my program");
	}
}
