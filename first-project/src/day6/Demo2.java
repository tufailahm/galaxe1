package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	List names;
	
	public Demo2() {
		names = new LinkedList();
		
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
		new Demo2();
	}
}
