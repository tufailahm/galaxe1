package day5;

public class Hello3 extends Thread {

	public Hello3() {

	}

	@Override
	public void run() {
		System.out.println("4. HELLO FROM RUN :  " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setName("GALAXE");
		t1.setPriority(MIN_PRIORITY);
		
		Hello3 h1 = new Hello3();
		Hello3 h2 = new Hello3();
		Hello3 h3 = new Hello3();
		h3.setName("TARUN");
		h2.setPriority(2);
		h1.setPriority(7);

		h1.setName("SOUND");
		System.out.println("3. Hello from Main called by : " + Thread.currentThread().getName());
		h2.setName("SCORE");

		h1.start();
		h2.start();
		h3.start();

	}
}
