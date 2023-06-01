package Assignments;

public class AsciiValues {

	public static void main(String[] args) {
// Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.

		System.out.println("Using while loop along with their ASCII numbers");
		System.out.println("From A-Z");
		char ch = 'A';
		while(ch <= 'Z') {
			System.out.println(ch + " = " + (byte)ch);
			ch++;
		}
		
		System.out.println("From a-z");
		char ch1 = 'a';
		while(ch1 <= 'z') {
			System.out.println(ch1 + " = " + (byte)ch1);
			ch1++;
		}
		
		System.out.println("Using for loop along with their ASCII numbers");
		
		System.out.println("From A-Z");		
		for(char ch2 = 'A';ch2 <= 'Z'; ch2++) {
			System.out.println(ch2 + " = " + (byte)ch2);
		}
		
		System.out.println("From a-z");		
		for(char ch3 = 'a';ch3 <= 'z'; ch3++) {
			System.out.println(ch3 + " = " + (byte)ch3);
		}	
	}
}
