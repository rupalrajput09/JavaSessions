package ExceptionHandling;

public class Testing {

	public static int div(int a, int b) {

		int z = -1;
		try {
			z = a / b; // ArithmeticException if b is zero
		} catch (ArithmeticException e) {
			System.out.println("b is 0 .. so AE is coming..");
		}
		return z;
	}

	public static void main(String[] args) {

		int d = div(10, 0);
		System.out.println(d);

	}

}
