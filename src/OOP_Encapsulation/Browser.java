package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser ...");
		checkBrowserVersion();
		checkOSCompatability();
		checkRAM();
		checkCPU();
		System.out.println("Browser is launched ...");
	}

	private void checkBrowserVersion() {
		System.out.println("check Browser Version ...");
	}

	private void checkOSCompatability() {
		System.out.println("check OS Compatability ...");
	}

	private void checkRAM() {
		System.out.println("checkRAM ...");
	}

	private void checkCPU() {
		System.out.println("check RAM ...");
	}

}
