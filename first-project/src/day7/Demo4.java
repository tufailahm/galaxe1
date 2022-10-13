package day7;



class Maths implements Calculation {

	@Override
	public int operation(int num1, int num2) {
		return num1 + num2;
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Maths m1 = new Maths();
		System.out.println(m1.operation(12, 12));
		
		//2nd way
	}

}
