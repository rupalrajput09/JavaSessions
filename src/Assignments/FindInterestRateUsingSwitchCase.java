package Assignments;

public class FindInterestRateUsingSwitchCase {

	public static void main(String[] args) {

//		Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//
//		For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		String loanType = "Housing Loan";
		int salary = 4520;
		
		switch (loanType) {
		case "Car Loan":
			System.out.println("Interest rate for car loan is at 5 %");
			break;
		case "Housing Loan":
			System.out.println("Interest rate for housing loan is at 7 %");
			if(salary < 35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
			}
			break;
		case "Personal Loan":
			System.out.println("Interest rate for personal loan is at 12 %");
			break;
		case "Education Loan":
			System.out.println("Interest rate for education loan is at 3 %");
			break;
		default:
			System.out.println("Select the loan type from given options");
			break;
		}
	}

}
