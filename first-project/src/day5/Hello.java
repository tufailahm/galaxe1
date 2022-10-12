package day5;

public class Hello extends Thread{
	
	Thread t1;
	public Hello() {
		t1 = new Thread(this);
		System.out.println("1. Inside cons 1: "+Thread.currentThread().getName());
		t1.start();
		System.out.println("2. Inside cons 2: "+Thread.currentThread().getName());

	}
	@Override
	public void run() {
		System.out.println("4. HELLO FROM RUN :  "+Thread.currentThread().getName());
	}
	public static void main(String[] args) throws InterruptedException {
		Hello h = new Hello();
		Thread.sleep(2000);
		System.out.println("3. Hello from Main called by : "+Thread.currentThread().getName());
	}
}
