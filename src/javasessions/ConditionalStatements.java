package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 5;
		int b = 5;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Hello");
		}
		
		int c = 10;
		if(c > a) {
			System.out.println("Bye");
		}
		
		if(true) { // dead code
			System.out.println("Hi Selenium");
		}
		else { // dead code
			  System.out.println("Bye Selenium");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("Right Practice");
		}
		else {
			System.out.println("Correct way to write code");
		}
		
		boolean test = true;
		if(!test) {
			System.out.println("Testing is done");
		}
		else {
			System.out.println("Testing is not done");
		}
		
		// nested if
		int number = 75;
		if(number <= 100) {
			System.out.println("Calculating your grades");
			if(number >= 90) {
				System.out.println("Grade A");
			
			if(number == 100) {
				System.out.println("You got 100% scholarship");
			}
			else {
				System.out.println("You are not eligible for 100% scholarship");
			}
		}
			else {
				if(number <= 80) {
					System.out.println("Grade B");
				}
			}
		
		}
		else {
			System.out.println("Plz pass the right marks");
		}
		
		// if if if - else
		
//		String browser = "ie";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("Launch Chrome");
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("Launch Firefox");
//		}
//		
//		if(browser.equals("safari")) {
//			System.out.println("Launch Safari");
//		}
//		
//		if(browser.equals("ie")) {
//			System.out.println("Launch IE");
//		}
//		
//		else {
//			System.out.println("Pass the right browser...");
//		}
		
		// if-else if
		
		String browser = "ie";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		else {
			System.out.println("Pass the right browser...");
		}
		}	
		
	}


