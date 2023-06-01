package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		int i = 1;
		System.out.println(i); //1
		// constant time : Big O(1)

		String name = "Tom";
		System.out.println(name); // O(1)
		
		
		int n = 10;
		for(int p = 1; p <= n; p++) {
			System.out.println(p);
			System.out.println(p+10);
		}
		//1 + n + n + n ==> 3n+1 ==> Linear Equation
		// 3n+1 ==> 3n ==> O(n)
		
		//1 to 100
		int p = 1;
		int q = 0;
		while(p <= 100) {
			System.out.println("Hi");
			System.out.println(p);
			System.out.println(q);
			p++;
			q++;
// time complexity => 1+1+n+n+n+n+n+n => 6n+2 => 2(3n+1)=> 2(3n)=> 6n => O(n) 
			
			System.out.println("-----------------");
			// nested loop
//			00 01 02 03 04
//			10 11 12 13 14
//			20 21 22 23 24 
//			30 31 32 33 34
			
			for(int u = 0; u<=4; u++) {
				for(int v = 0; v<=4; v++) {
					System.out.print(u+""+v+" ");
				}
				System.out.println();
			}
			// time complexity =>	
	// (1+n+n+n)(1+n+n+n) => (1+3n)(1+3n) => 1+3n+3n+9n^2 => 9n^2+6n+1 => Quadratic Equation
	// 9n^2+6n => 3(3n^2+2n) => n^2+n => n(n+1) => n^2 => O(n^2)
			
			for(int u = 0; u<=4; u++) {
				for(int v = 0; v<=4; v++) {
					for(int w = 0; w <=4; w++) {
					System.out.print(u+""+v+""+w+" ");
				}
				System.out.println();
			}
			}
//(1+n+n+n)(1+n+n+n)(1+n+n+n) => (1+3n)(1+3n)(1+3n) => 	(1+3n)(1+3n+3n+9n^2) => (1+3n)(1+6n+9n^2)
// => 1+6n+9n^2+3n+18n^2+27n^3 => 27n^3+27n^2+9n+1 => n^3+n^2+n+1 => O(n^3)			
			
			// BS (Binary Search):
			// k = n/2
			// log k = log(n/2)
			// log k = log n +/- log2
			// log k = log n
			// k = log(n)

			
			}
		
	}

}
