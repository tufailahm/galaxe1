package day7;

public class Demo3 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
			System.out.println("RUN CALLED BY :"+Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		System.out.println("MAIN CALLED BY :"+Thread.currentThread().getName());
	}

}
