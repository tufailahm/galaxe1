package day2;

class Calculation
{
	public void add(int num1,int num2) {
		System.out.println("Adding two numbers :"+(num1+num2));
	}
	public void add(String name,int num2) {
		System.out.println("Adding one number and on string :"+(name+num2));
	}
	
	public void add(int...numbers) {
		int sum=0;
		for(int i:numbers)
		{
			sum += i;
		}
		System.out.println("Sum of the all numbers using var args :"+sum);
	}
	
	
	
	
	
	
	public void openAccount(String name,String email) {
		
	}
	public void openAccount(String name,String email, String mobile) {
		
	}
	public void paymentMode(String paytm,String phonepe)
	{
		
	}
	public void paymentMode(String paytm,String phonepe,String netbanking)
	{
		
	}
	public void admidPatient(String patientName,String symptoms) {
		
	}
	public void admidPatient(String patientName,String symptoms,String doctorName) {
		
	}
	public void orderPizza() {
		
	}
	public void orderPizza(String pizzaType) {
		
	}
	public void orderPizza(String pizzaType,String addOns) {
		
	}
	
}
public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println(true);
		System.out.println("JJ");
		System.out.println(87);
		
		Calculation c= new Calculation();
		c.add(76,55);		//2 
		c.add("jj",55);
		c.add();             // var args
		c.add(9,7,7,76);   //var args
		c.add(9,7,7,76,8); 
	}
}
