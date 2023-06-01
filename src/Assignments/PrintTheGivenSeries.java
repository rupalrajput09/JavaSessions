package Assignments;

public class PrintTheGivenSeries {

	public static void main(String[] args) {
		
		// 1.0 2.0 3.0  ...... 10.0 

		for(float f = 1.0f; f <= 10.0f; f++) {
			System.out.println(f);
		}
		
		// 0 9 18 27 36 …99
		
		int i = 0;
		while( i <= 99) {
			System.out.println(i);
			i = i + 9;
		}
	}
}
