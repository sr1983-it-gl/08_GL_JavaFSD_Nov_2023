package dsa.brackets.balancer;

class Employee {
	
	String name;
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class CallByValueAndReference {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("A is " + a);
		method2(a);
		System.out.println("A is " + a);
		
		Employee e1 = new Employee();
		System.out.println(e1.getName());
		
		method1(e1);
		System.out.println(e1.getName());
	}
	
	static void method1(Employee emp) {
		
		emp.setName("John");
	}
	
	static void method2(int a) {
		
		a = 20;
		
		a = a + 100;
	}
}
