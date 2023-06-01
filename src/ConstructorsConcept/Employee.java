package ConstructorsConcept;

public class Employee {

	String name;
	int age;
	double salary;

	// create constructor
	// name is as same as the class name
	// cannot have any return value/ void
	// no return type
	// constructor will be called when you create the object
	// constructor can be overloaded
	// constructor are stored inside the class memory

	public Employee() {
		// 0 parameter constructor
		System.out.println("Default Constructor ...");
	}

	public Employee(int i) {
		// 1 parameter constructor
		System.out.println("Parameterized Constructor ..." + i);
	}

	public Employee(int i, String p) {
		// 2 parameter constructor
		System.out.println("Parameterized Constructor ..." + i + " " + p);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();

		obj.name = "Tom";
		obj.age = 20;
		obj.salary = 12.33;

		Employee obj1 = new Employee(15);
		Employee obj2 = new Employee(15, "Nivedita");

	}

}
