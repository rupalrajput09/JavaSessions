package javasessions;

public class A {

	public static void main(String[] args) {

		System.out.println("A - main");
		
		// calling B class main method from A class main method
		
		B.main(args); // calling by class name as the method is static
		
		
		
	}

}
