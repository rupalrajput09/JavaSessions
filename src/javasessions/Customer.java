package javasessions;

public class Customer {

	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;

	public static void main(String[] args) {

		Customer c1 = new Customer();

		System.out.println(c1.name); // null
		System.out.println(c1.age); // 0
		System.out.println(c1.salary); // 0.0
		System.out.println(c1.gender); // \u0000
		System.out.println(c1.isActive); // false
		System.out.println(c1.dob); // null

		c1.name = "Tom";
		System.out.println(c1.name);

		Customer c2 = new Customer(); // object with reference
		Customer c3 = new Customer(); // object with reference

		new Customer(); // no reference object

		Customer c4; // just a reference without object

		Customer c5 = new Customer();
		c5 = null; // null reference object

		// call garbage collector
		// System.gc(); // is not recommended ... not a good practice

		Customer c6 = new Customer(); // eligible for garbage collector after pointing to c7
		Customer c7 = new Customer();
		c6 = c7;

		Customer c8; // no garbage collector
		c8 = new Customer(); // no garbage collector here

	}

}
