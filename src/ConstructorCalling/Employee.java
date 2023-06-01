package ConstructorCalling;

public class Employee {

	String name;
	int age;
	String city;

	public Employee() {
		this("Anju", 25, "LA");
		System.out.println("Default constructor");
	}

	public Employee(String name) {
		this("Ravi", 22);
		System.out.println("Hi Emp");
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String city) {
		System.out.println("3 param constructor");
		this.name = name;
		this.age = 34;
		this.city = "CA";
	}

}
