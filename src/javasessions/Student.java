package javasessions;

public class Student {

	// WAF (write a function)
	// create a method - getStudentMarks
	// pass the parameter: studentName (String)
	// return the student marks --> int

	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for : " + studentName);
		int marks = -1;

		if (studentName.equalsIgnoreCase("Riya")) {
			marks = 90;
		} else if (studentName.equalsIgnoreCase("Vikas")) {
			marks = 100;
		} else if (studentName.equalsIgnoreCase("Neetu")) {
			marks = 80;
		} else if (studentName.equalsIgnoreCase("Naveen")) {
			marks = 10;
		} else {
			System.out.println("No student found... pls pass the right student name ... " + studentName);
		}
		return marks;
	}

	public static void main(String[] args) {

		Student s1 = new Student();

		int m1 = s1.getStudentMarks("Riya");
		System.out.println(m1); // 90

		int m2 = s1.getStudentMarks("Naveen");
		System.out.println(m2 + 60); // 70
		if (m2 >= 0) {
			System.out.println("Print the marksheet");
		}

		int m3 = s1.getStudentMarks("Tom");
		System.out.println(m3); // -1

		if (m3 >= 0) {
			System.out.println("Print the marksheet");
		}

		int m4 = s1.getStudentMarks("Peter");
		System.out.println(m4); // -1

		if (m4 >= 0) {
			System.out.println("Print the marksheet");
		}

	}

}
