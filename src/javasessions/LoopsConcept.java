package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// while loop
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
			// i = i+1
			//++i;
			
		}
		
	//	while(true) {
	//		System.out.println("Welcome to Hotel Taj");
			//break;
	//	}
		
// unreachable code OR dead code , never write this code b'coz you will never reach here throw error
//		while(false) {
//			System.out.println("Welcome to Hotel Taj");
//		}
		
		int k = 1;
		while(true) {
			System.out.println("Welcome to Hotel Taj");
			//k++; can also be written here
			if(k==5) {
			break;
		}
		k++;
	}
		// for loop
		// 1 to 10
		//for(initialize ; condition; increment/decrement)
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		//j++; // do not place j here
		
//		for( ; ; ) {
//			System.out.println("Welcome");
//		}
		
//		for( ;false ; ) {//dead code
//			System.out.println("Welcome");
//		}
	
//		for( ;true ; ) { //generate infinite loop
//			System.out.println("Welcome to naveen automation lab");
//		}
		
		int c = 1;
		for( ;true ; ) {
			System.out.println("Welcome welcome");
			if(c==5) {
				break;
			}
			c++;
		}
		
		int p;
		for(p = 1; p <=5; p++) {
			System.out.println(p);
		}
		
		// a-z with ASCII value
		for(char ch = 'a'; ch <='z'; ch++) {
			//System.out.println(ch);
			System.out.println(ch + "=" + (byte)ch);
		}
		
		for(byte ch = 'a'; ch <='z'; ch++) {
			System.out.println(ch + " declare as byte =" + ch);
		}
		
		byte b = 'a';
		System.out.println(b); // 97 b'coz type of b is byte
		
		// boolean can't be used with for loop can't increase/ decrease values
//		for(boolean flag = true; flag <= true; flag++) {
//			
//		}
		
		// try with float, int, short, byte , long, char -- for/ while
		
		// String can't be used with for loop can't increase/ decrease values
//		for(String s = "Tom"; s == "Tom"; s++) {
//			
//		}
		
	}
}
