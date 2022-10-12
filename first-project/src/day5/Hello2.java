package day5;

public class Hello2 implements Runnable{
	
	Thread t1;
	public Hello2() {
		t1 = new Thread(this);
		System.out.println("1. Inside cons 1: "+Thread.currentThread().getName());
		t1.start();
		System.out.println("2. Inside cons 2: "+Thread.currentThread().getName());

	}
	@Override
	public void run() {
		System.out.println("4. HELLO FROM RUN :  "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Hello2 h = new Hello2();
		System.out.println("3. Hello from Main called by : "+Thread.currentThread().getName());
	}
}
