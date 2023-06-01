package Assignments;

public class PrintTenToOne {

	public static void main(String[] args) {
		
		System.out.println("using for loop");
		for(int i = 10; i >=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("using while loop");
		int i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("using do while loop");
		int j = 10;
		do {
			System.out.println(j);
			j--;
		}
		while(j>=1);
	}
}
