package Assignments;

public class GreatestNumber {

	public static void main(String[] args) {

		int num1 = 25;
		int num2 = 78;
		int num3 = 87;
		int num4 = 97;
		
		if(num1>num2 && num1>num3 && num1 > num4) {
			System.out.println(num1 + " is the greatest");
		}
		else if(num2 > num3 && num2 >num4) {
			System.out.println(num2 +" is the greatest");
		}
		else if(num3 > num4) {
			System.out.println(num3 + " is the greatest");
		}
		else {
			System.out.println(num4 + " is the greatest");
		}
		
//		if(num1>num2 && num1>num3) {
//		System.out.println(num1 + " is the greatest");
//	}
//	else if(num2 > num3) {
//		System.out.println(num2 +" is the greatest");
//	}
//	else {
//		System.out.println(num3 + " is the greatest");
//	}
	}

}
