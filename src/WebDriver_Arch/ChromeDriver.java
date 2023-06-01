package WebDriver_Arch;

public class ChromeDriver implements WebDriver {

	// Constructor
	public ChromeDriver() {
		System.out.println("Launch Chrome Browser ...");
	}

	@Override
	public void get(String url) {
		System.out.println("Entering url :- " + url);
	}

	@Override
	public String getTitle() {

		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("Click on :- " + element);

	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering value " + value + "into " + element);

	}

	@Override
	public void close() {
		System.out.println("Close browser");

	}

	@Override
	public void findElement(String element) {
		System.out.println("Finding element by using :- " + element);

	}

	public void chromeSpecific() {
		System.out.println("Method is specific to chrome driver");
	}

}
