package javasessions;

public class MethodsInJava {

	// methods -- class data member
	// void -- no return -- function cannot return anything

	// 1. no input , no return
	public void test() {
		System.out.println("Test Method");
		int i = 10;
		System.out.println(i);
	}

	// 2. no input, but some return
	// return type int
	// purpose of return is we can use it for further purpose.

	public int totalAmount() {
		System.out.println("Total Amount ...");
		int i = 10;
		int tax = 5;
		int finalPayment = i + tax;
		return finalPayment;
	}

	public String trainerName() {
		System.out.println("trainer name");
		String name = "Naveen";
		return name;
	}

	public char getGender() {
		System.out.println("get gender");
		char c = 'a';
		return c;
		// return 'a'; // can be done directly as well
	}

	// 3. some input , some return

	public int add(int a, int b) { // method parameters (at method level we call it method parameters)
		System.out.println("Adding two numbers..");
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// create a object:

		MethodsInJava obj = new MethodsInJava();
		obj.test();// calling a method

		int val = obj.totalAmount();
		System.out.println(val);

		String tr = obj.trainerName();
		System.out.println(tr);
		if (tr.equals("Naveen")) {
			System.out.println("Naveen Automation Labs");
		}

		// System.out.println(obj.getGender()); // not a good practice, can't use return
		// value further purpose/ manipulation

		char ch = obj.getGender();
		System.out.println(ch);
		System.out.println((byte) ch); // 97

		int s1 = obj.add(10, 20); // 1-1 mapping
		System.out.println(s1);

		int s2 = obj.add(30, 40); // arguments means values that you are passing, we are passing arguments to add
									// method
		// when we call method at value level we call it arguments

		System.out.println(s2 - 5); // 65

	}

}
