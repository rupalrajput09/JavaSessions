package SuperWithInterface;

public class Selenium implements Google {

	@Override
	public void search() {
		System.out.println("Selenium Search");

		// super.RESULT_COUNT; // cannot access because of static

		System.out.println(Google.RESULTS_COUNT);
	}

	// practice with abstract classes

}
