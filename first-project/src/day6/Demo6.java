package day6;

import java.util.Set;
import java.util.TreeSet;

public class Demo6 {

	 Set names;
	
	public Demo6() {
		names = new TreeSet();	//no order is guranteed
		 
		names.add("Vamsi");
		names.add("Purshottam");
		names.add("Sandeep");
		names.add("Anu");
		names.add("Sohail");
		names.add("Vamsi");
		
		System.out.println(names);
		
		names.add("Ahmed");
		//names.add(2, "Kalpana");
		System.out.println(names);
		names.remove("Sohail");
		names.remove("Vamsi");
		
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
		Object[] newname = names.toArray();
		System.out.println(newname[2]);
		names.clear();
	}

	public static void main(String[] args) {
		new Demo6();
	}
}