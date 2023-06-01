package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "opera";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome .. ");
		}
		else if(browser.equals("firefox")) {
			System.out.println("Launch firefox .. ");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch safari .. ");
		}
		else {
			System.out.println("Plz pass the right browser .. ");
			throw new MyException("BrowserNotFoundException");
		}		
		
	}

}
