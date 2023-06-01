package javasessions;

public class StudentWithSwitchCase {
	
	public int getStudentMarks(String studentName) {
		
		System.out.println("Getting student marks ... " + studentName);
		int marks = -1;
		
		switch(studentName) {
		
		case "Pooja":
		marks = 55;
		break;
		
		case "Tripti":
			marks = 96;
			break;
			
		case "Ranu":
			marks = 74;
			break;
		
		default:
			System.out.println("Pls pass the correct student name");
		break;
		}
		
		return marks;
	}
		
	public static void main(String[] args) {
		
		StudentWithSwitchCase s1 = new StudentWithSwitchCase();
		int m1 = s1.getStudentMarks("Pooja");
		System.out.println(m1);
		if(m1 >= 0) {
			System.out.println("Print the marksheet .. ");
		}
		
		int m2 = s1.getStudentMarks("Raina");
		System.out.println(m2);
		if(m2 >= 0) {
			System.out.println("Print the marksheet .. ");
		}
		
		int m3 = s1.getStudentMarks("Tripti");
		System.out.println(m3);
		if(m3 >= 0) {
			System.out.println("Print the marksheet .. ");
		}
	}
}
