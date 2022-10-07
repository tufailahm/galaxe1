package day2;

public class StringDemo {

	public static void main(String[] args) {
		String name1 = "Kalpana";
		String name2 = new String("Kalpana");
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		//mutable
		StringBuffer sb1 = new StringBuffer("Hi");
		sb1.append(" and welcome");
		
		System.out.println(sb1);
		
//		JDK1.5	- Not Thread safe
		StringBuilder sb2 = new StringBuilder("Hi");
		
		System.out.println(sb2);
	}
}
