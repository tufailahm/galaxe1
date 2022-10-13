package day7;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Map<String, Integer> employees = new HashMap<String, Integer>();
		
		employees.put("Jay", 95000);
		employees.put("Anu", 195000);
		employees.put("Isha", 295000);
		employees.put("Tarun", 395000);
		
		employees.remove("Isha");
		
		System.out.println(employees.size());
		
		System.out.println(employees);
	}

}
