package day2;

public class Z {
	W w = new W();
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}

	public Z() {
		System.out.println("Z constructor");
	}

	public static void main(String st[]) {
		System.out.println("In main");
		new Z();
		new Z();
	}
}
