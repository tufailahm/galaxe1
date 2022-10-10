package day4;

import java.util.Scanner;

public class ExceptionDemo4 {

	int num1, num2, result;
	Scanner scanner = new Scanner(System.in);
	String name;
	public void display() throws InterruptedException {
		System.out.println("Hi ");
			Thread.sleep(2000);
		System.out.println("Bye");
	}
	public void display2() throws InterruptedException {
		System.out.println("Hi ");
			Thread.sleep(2000);
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo4 demo1 = new ExceptionDemo4();
		try {
			demo1.display();
			demo1.display2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thanks for using my program");
	}
}