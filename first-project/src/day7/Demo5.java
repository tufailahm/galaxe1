package day7;

public class Demo5 {

	public static void main(String[] args) {
		Calculation calculation = new Calculation() {

			@Override
			public int operation(int num1, int num2) {
				return num1 + num2;
			}
		};

		System.out.println(calculation.operation(12, 12));
	}

}
