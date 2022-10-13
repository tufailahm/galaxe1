package day7;
@FunctionalInterface
interface Calculation {
	int operation(int num1, int num2);
}
public class Demo6 {

	public static void main(String[] args) {
		Calculation calculation = (n1,n2) -> n1+n2;
		System.out.println(calculation.operation(12, 12));
		
		Runnable r = () -> System.out.println("RUN CALLED BY : "+Thread.currentThread().getName());
		Thread t1 = new Thread(r);
		t1.start();
	}

}
