package day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo5 {

	Set names;
	
	public Demo5() {
		names = new LinkedHashSet();	//no order is guranteed
		
		names.add("Vamsi");
		names.add("Purshottam");
		names.add("Sandeep");
		names.add("Sohail");
		names.add("Vamsi");
		
		System.out.println(names);
		
		names.add("Ahmed");
		//names.add(2, "Kalpana");
		System.out.println(names);
		names.remove("Sohail");
		names.remove(4);
		
		System.out.println("After adding and removing");
		System.out.println(names);
		
		System.out.println(names.contains("Vamsi"));
	
	//	System.out.println(names.get(3));
		System.out.println(names.isEmpty());
		System.out.println(names.size());
	//	names.set(1, "Yamini");
		
		System.out.println(names);
	//	names.add(2,"Manogna");
		System.out.println(names);
		names.clear();
	}

	public static void main(String[] args) {
		new Demo5();
	}
}
