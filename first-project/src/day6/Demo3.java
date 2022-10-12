package day6;

import java.util.List;
import java.util.Vector;

public class Demo3 {

	List names;
	
	public Demo3() {
		names = new Vector();
		
		names.add("Vamsi");
		names.add("Purshottam");
		names.add("Sandeep");
		names.add("Sohail");
		names.add("Vamsi");
		
		System.out.println(names);
		
		names.add("Ahmed");
		names.add(2, "Kalpana");
		System.out.println(names);
		names.remove("Sohail");
		names.remove(4);
		
		System.out.println("After adding and removing");
		System.out.println(names);
		
		System.out.println(names.contains("Vamsi"));
	
		System.out.println(names.get(3));
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		names.set(1, "Yamini");
		
		System.out.println(names);
		names.add(2,"Manogna");
		System.out.println(names);
		names.clear();
	}

	public static void main(String[] args) {
		new Demo3();
	}
}
