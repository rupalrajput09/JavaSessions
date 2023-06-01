package javasessions;

public class StackMemory {

	// non static method call non static method--> yes (no need to create object)
	// static method call static method --> yes (no need to create object)
	// non static method calling static method --> call directly / or by using class name
	// (no need to create object)
	// static method calling non static --> create object for this (just like main()
	// method calling non static method)

	// stack memory allocation is based on --> LIFO
	// Queue --> FIFO
	// Stack --> out of memory -> Stack overflow error

	public static void t1() {
		System.out.println("t1 method");
		t2();

	}

	public static void t2() {
		System.out.println("t2 method");
		t3();

	}

	public static void t3() {
		System.out.println("t3 method");

		// calling a non static method, create a object to call

		StackMemory obj1 = new StackMemory();
		obj1.m1();

	}

	public void m1() {
		System.out.println("m1 method");

		m2();

	}

	public void m2() {
		System.out.println("m2 method");
		m3();

	}

	public void m3() {
		System.out.println("m3 method");
		// m1(); // infinite method calling, result in stackoverflow
		StackMemory.t1();
		// t1(); // can call but not a good practice
	}

	public static void main(String[] args) {

		StackMemory obj = new StackMemory();

		obj.m1();

	}

}
