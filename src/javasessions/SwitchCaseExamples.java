package javasessions;

public class SwitchCaseExamples {

	public static void main(String[] args) {

		// byte, short, int , char, String - valid
		// long, float, double, boolean - not valid
		
		int num = 10;
		switch (num) {
		case 10:
			System.out.println("10");
			break;

		default:
			break;
		}
		
		String stName = "tani";
		int marks = 0;
		
		switch(stName.toLowerCase().trim()) {
		case "tom":
			System.out.println("Tom passed");
			marks = 100 - 20; 
			break;
			
		case "peter":
			System.out.println("Peter passed");
			marks = 100;
			break;
			
		case "tani":
			System.out.println("Tani passed");
			marks = 100;
			break;
		default:
			System.out.println("student is not found " + stName);
			marks = -1;
			break;
		}	
			System.out.println(marks);
			if(marks >= 0) {
				System.out.println("Print the marksheet");
			}
			else {
				System.out.println("No need to print");
			}
		
		}	
		
	}


