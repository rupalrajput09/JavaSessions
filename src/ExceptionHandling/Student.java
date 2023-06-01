package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {
		System.out.println("Getting marks for :- " + name);

		if (name.equals("suchi")) {

			try {
				int i = 9 / 0;
//				int i = 9 / 3;
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming ... ");
//				System.exit(1); // shutdown the JVM, never use
				return 80;
			} finally {
				System.out.println("Final Marks");
				return 50;
			}

		} else if (name.equals("tom")) {
			return 90;
		} else if (name.equals("riya")) {
			return 80;
		} else {
			System.out.println("Student not found ...");
			throw new MyException("StudentNotFoundException");
		}
	}

	public static void main(String[] args) {

		int m = getMarks("suchi");
		System.out.println(m);

	}

}
