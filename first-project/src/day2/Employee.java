package day2;

public class Employee {

	public Employee() {
		System.out.println("4. DEF CONS");
	}

	{
		System.out.println("3. INSTANCE BLOCK");
	}
	static {
		System.out.println("1.STATIC BLOCK");
	}

	public static void main(String[] args) {
		System.out.println("2. MAIN CALLED");
		new Employee();
	}
}
