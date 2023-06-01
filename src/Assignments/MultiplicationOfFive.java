package Assignments;

public class MultiplicationOfFive {

	public static void main(String[] args) {
		// to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
	
		System.out.println("Using while loop");
		int i = 1;
		while(i <= 100) {
			System.out.println(5 * i);
			i++;
		}
		
		System.out.println("Using for loop");
		for(int j = 1; j <= 100; j++) {
			System.out.println(5 * j);
		}
		
		System.out.println("Using do-while loop");

		int k = 1;
		do {
			System.out.println(5 * k);
			k++;
		}
		while(k <= 100);
	}
}
