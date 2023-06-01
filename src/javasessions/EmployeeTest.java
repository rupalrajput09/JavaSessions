package javasessions;

public class EmployeeTest {

	String name;
	int age;

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void printMsg() { // calling a method
		System.out.println("Hello");
	}

	public void getEmpInfo(EmployeeTest ob) { // ob can be used in this particular method only

		ob.name = "Bharti";
		ob.age = 11;

		System.out.println(name); // Bharti
		System.out.println(age); // 11
	}

	public static void main(String[] args) {

		EmployeeTest obj = new EmployeeTest();
		obj.add(20, 30); // call by value/ argument

		// obj.getEmpInfo(); // null 0

		obj.getEmpInfo(obj); // call by reference

		System.out.println(obj.name); // Bharti
		System.out.println(obj.age); // 11

		obj.name = "Reena";
		obj.age = 30;

		System.out.println(obj.name); // Reena
		System.out.println(obj.age); // 30

		obj.getEmpInfo(obj); // call by reference
		// Bharti
		// 11

		System.out.println(obj.name); // Bharti
		System.out.println(obj.age); // 11

	}

}
