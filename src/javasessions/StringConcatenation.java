package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println(a+b); // 30
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(x+y); // HelloSelenium (Concatenation operator, here we are concatenation/merging two strings)
		
		System.out.println(a+x); // 10Hello
		
		System.out.println(a+b+x+y); // 30HelloSelenium		
		System.out.println(x+y+a+b); // HelloSelenium1020		
		System.out.println(x+y+(a+b)); //HelloSelenium30
		
		System.out.println(a+b+x+y+a+b); //30HelloSelenium1020
		System.out.println(a+b+x+y+(a+b));// 30HelloSelenium30
		
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d); // HelloSelenium12.3323.44
		System.out.println(x+y+a+b+c+d); // HelloSelenium102012.3323.44
		
		char g = 'm';
		char p = 'n';
		
		String l = "Testing"; 
		String u = "Automation";
		
		System.out.println(l+u);
		System.out.println(l+u+g+p); //TestingAutomationmn

		char t1 = 'a'; // ASCII value of a = 97
		char t2 = 'b'; // ASCII value of b = 98
		
		System.out.println(t1+t2); //195
		
		char t3 = 'z'; // 122
		System.out.println(t1+t2+t3); // 317
		
		System.out.println(t1); // a , b'coz we are not performing any mathematical operation here
		System.out.println(t2-t1); //  1 
		
		char gender =  'm';
		
		System.out.println(a); // 10 , treating a as a variable here
		System.out.println('a'); // a , b'coz we have deliberately write a here as a character in single quote
		
		System.out.println('a'+'b'); // 195
		
		System.out.println("a+b"); // a+b
		
		// a-z = 97 to 122
		// A-Z = 65 to 90
		// 0-9 = 48 to 57
		
		System.out.println('$'); // $
		
		System.out.println('$'+'a'); // 36+97 = 133
		
		System.out.println((byte)'a'); //97 here printing ASCII value of a
		System.out.println((byte)'$'); // 36
		
		int s1 = 100;
		int s2 = 300; 
		System.out.println("the value of s1 is : " + s1); // the value of s1 is : 100(performing concatenation)
		
		System.out.println("The sum is : " + s1 + s2);// The sum is : 100300 (performing concatenation here)
		System.out.println("The sum is : " + (s1 + s2)); // The sum is : 400 (keep s1 and s2 in bracket to add)
		
		


		
		
		
		
		
		
		

	}

}
