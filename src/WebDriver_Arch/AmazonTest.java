package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

		// chrome

		// ChromeDriver driverCh = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "firefox";
		WebDriver driver = null;

		// cross browser logic

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Plz pass the right browser .....");
		}

		driver.get("https://www.amamzon.com");

		String title = driver.getTitle();
		System.out.println("Page Title :- " + title);

		driver.findElement("emailId");

		driver.sendKeys("emailId", "abc@gmail.com");

		driver.findElement("password");
		driver.sendKeys("password", "abc@123");

		driver.findElement("loginButton");
		driver.click("loginButton");

		driver.close();
		
	//	driverCh.chromeSpecific();
	

	}

}
