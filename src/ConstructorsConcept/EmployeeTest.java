package ConstructorsConcept;

public class EmployeeTest {

	String name;
	int age;
	double salary;

	// when you do not create a constructor, Java add hidden constructor (default
	// constructor) for you
	// hidden constructor will be given by JVM at the run time
	// this keyword will be used to access global/ class variable

	public EmployeeTest(String name) {
		this.name = name;
	}

	public EmployeeTest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public EmployeeTest(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {

		EmployeeTest e1 = new EmployeeTest("Tom");

		System.out.println(e1.name); // Tom
		System.out.println(e1.age); // 0
		System.out.println(e1.salary); // 0.0

		EmployeeTest e2 = new EmployeeTest("Mini", 12);

		System.out.println(e2.name); // Mini
		System.out.println(e2.age); // 12
		System.out.println(e2.salary); // 0.0
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);
		e2.salary = 25.26;
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);

		EmployeeTest e3 = new EmployeeTest("Rimi", 30, 12.96);
		System.out.println(e3.name + " " + e3.age + " " + e3.salary); // Rimi 30 12.96

		System.out.println(e3); // ConstructorsConcept.EmployeeTest@4361bd48 (give the memory address of the
								// object reference)

	}

}
