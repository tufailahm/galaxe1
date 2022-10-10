package day4;

import java.util.Scanner;

public class ExceptionDemo2 {

	int num1, num2, result;
	Scanner scanner = new Scanner(System.in);

	public void display() {
		System.out.println("Hi ");
		try {
			int marks [] = new int[5];
			System.out.println("The marks is :" + marks[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrays cannot be accessed beyond its limits");
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		catch (Exception e) {
			System.out.println("Exception happened :"+e.getMessage());
		}
		finally {
			System.out.println("FINALLY CALLED");
			//closing thyer db 
		}
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo2 demo1 = new ExceptionDemo2();
		demo1.display();

		System.out.println("Thanks for using my program");
	}
}
