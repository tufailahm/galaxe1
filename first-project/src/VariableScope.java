
public class VariableScope {
	
	int i=10;				//instance scope
	static int j=20;		//class scope
	public void changeValue() {
			int k=30;		//local scope
			i++;
			j++;
	}
	public void display() {
			System.out.println(i);
			System.out.println(j);
	}
	public static void demo() {
		System.out.println(j);
	}
	public static void main(String[] args) {
		VariableScope v1 = new VariableScope();
		v1.changeValue();
		v1.display();
		VariableScope v2 = new VariableScope();
		v2.changeValue();
		v2.display();
		
		
		System.out.println(j);
		System.out.println(v1.j);
		System.out.println(v2.j);
		System.out.println(VariableScope.j);
	}
}
