package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {

		System.out.println(4/2); // 2
		System.out.println(4+2); // 6
		System.out.println(4-2); // 2
		System.out.println(4*2); // 8
		
		System.out.println(9/3); // 3
		System.out.println(9/2); // 4 , b'coz both are integer
		
		System.out.println(9.0/2); // 4.5 , b'coz one of the number is floating point number		
		System.out.println(9/2.0); // 4.5 , b'coz one of the number is floating point number		
		System.out.println(9.0/2.0); // 4.5 , b'coz both numbers are floating point number
		
		System.out.println((float)9/2); // 4.5 , b'coz we are deliberately writing that we want result in float
		
		System.out.println(0/9); // 0 
		
	//	System.out.println(9/0); // throw error ,ArithmeticException: / by zero
	//	System.out.println(0/0); // throw error ,ArithmeticException: / by zero
	// Arithmetic exception is only for integer values

		System.out.println(9.0/0); // Infinity		
		System.out.println(9/0.0); // Infinity		
		System.out.println(9.0/0.0); // Infinity
		System.out.println((float)9/0); // Infinity

		
		System.out.println(0.0/0.0); // NaN
		System.out.println(0.0/0); // NaN  (0.0 is nothing)
		System.out.println(0/0.0); // NaN  (0.0 is nothing)

		
		System.out.println(0.0/2.0); // 0.0
		
		System.out.println('a'/2); // 48
		System.out.println((float)'a'/2); // 48.5
		
		System.out.println(9 % 3); // 0 (remainder)
		
		System.out.println(9 % 2); // 1 (remainder)
		
		System.out.println(100 % 5); // 0 (remainder)

		System.out.println((float)9 % 2); // 1.0

		
		
		
		
		
		
		
	}

}
