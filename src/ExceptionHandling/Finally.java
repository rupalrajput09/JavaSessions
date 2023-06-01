package ExceptionHandling;

public class Finally {

	public static void main(String[] args) {

		System.out.println("Hi");
		
		try {
//			int i = 9/3;
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
		}
		
		finally {
		System.out.println("Bye, Finally block");
		}	
	}

}
