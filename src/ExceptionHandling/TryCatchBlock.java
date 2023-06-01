package ExceptionHandling;

public class TryCatchBlock {

	int age;
	
	public static void main(String[] args) {
		
		TryCatchBlock obj = new TryCatchBlock();
		
		obj = null;		
		try {
		obj.age = 10; // NullPointerException
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException is coming ...");
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------");
		
		
		
		

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
//		int i = 9/0; // how to handle
		
		try {
			int i = 9/0;
//			int i = 9/3;
//			System.out.println("Will it execute if there is exception"); // No
//			System.out.println("Will it print if there is exception"); // No

		}catch(ArithmeticException e) {
			System.out.println("AE is coming ...");
			e.printStackTrace(); 
		}
				
		System.out.println("bye");
		
	}

}
