package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Demo7_Searching {

	List<String> names;
	
	public Demo7_Searching() {
		names = new ArrayList<String>();
		
		names.add("Vamsi");
		names.add("Purshottam");
		names.add("Anu");
		names.add("Sandeep");
		names.add("Sohail");
		names.add("Ashraf");
		names.add("Aman");
		names.add("Vamsi");
		
		Collections.sort(names, Comparator.reverseOrder());
		
		System.out.println(names);
		System.out.println(Collections.binarySearch(names, "Anu"));
		
		//		Collections.disjoint
	
	}

	public static void main(String[] args) {
		new Demo7_Searching();
	}
}
