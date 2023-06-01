package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			if(10 > 5) {
				System.out.println("10 is greater than 5");
			}
			break;
		case "firefox":
			System.out.println("launch firfox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("pass the right browser...");
			break;
		}
	}

}
