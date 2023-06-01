package ExceptionHandling;

public class MultipleTryCatchBlock {

	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0; // AE

			MultipleTryCatchBlock obj = new MultipleTryCatchBlock();

			obj = null; // NPE
			obj.age = 20;

		} catch (ArithmeticException e) {
			System.out.println("AE is coming ...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming ...");
			e.printStackTrace();
		} 

		System.out.println("bye");

	}

}
