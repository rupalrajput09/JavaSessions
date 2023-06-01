package javasessions;

public class B {

	public static void main(String[] args) {

		System.out.println("B - main");
		
		A.main(args); 
		// after printing B - main A - main a number of times it will give java.lang.StackOverflowError
		
		// stackoverflow means memory over flow
	}

}
