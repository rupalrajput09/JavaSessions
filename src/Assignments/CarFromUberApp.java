package Assignments;

public class CarFromUberApp {

	public static void main(String[] args) {
//		1.	Car Type: Mini, Sedan, SUV, Premium
//		2.	If user passes wrong car type, print please select the right car type

		String carType = "SUV";
		
		switch (carType.toLowerCase()) {
		case "mini":
			System.out.println("You choose mini car");
			break;
		case "seadn":
			System.out.println("You choose Sedan car");
			break;
		case "suv":
			System.out.println("You choose SUV car");
			break;
		case "premium":
			System.out.println("You choose Premium car");
			break;
		default:
			System.out.println("select the right car type");
			break;
		}
	}

}
