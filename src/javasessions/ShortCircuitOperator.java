package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {

		int a = -2000;
		int b = 300;
		int c = 500;
		
		// && is short circuit operator
		
		if(a>b && a>c) {
			System.out.println("a is greatest");
		}
		else if(b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("C is greatest");
		}
		
	}

}
