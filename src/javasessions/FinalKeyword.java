package javasessions;

public class FinalKeyword {

	public static void main(String[] args) {

		// constant values
		
		int x = 10;
		x = 20;
		x = 30;
		x = 40;
		System.out.println(x);
		
		final int days = 7; 
		int salary = days * 100;
		System.out.println(salary);
		
		final int DEFAULT_TIME_OUT = 10; // good practice
		
		final String LOGIN_PAGE_TITLE = "Amazon Login"; 
		final String ACCOUNT_NUMBER; // Date Of Birth, logo image
		
		final char gender = 'f';		
		
	}

}
