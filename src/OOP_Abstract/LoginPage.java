package OOP_Abstract;

public class LoginPage extends Page {

	
	public LoginPage() {
		System.out.println("child Login Page ---- default constructor .....");
	}
	
	public LoginPage(int i ) {
		System.out.println("child Login Page ---- param constructor ....." + i);
	}
	
	
	@Override
	public void title() {
		System.out.println("Login Title");
	}

	@Override
	public void url() {
		System.out.println("https:abc.com");
	}

	@Override
	public void pageLoadTimeOut() {
		System.out.println("Page time out -- 5 seconds");
	}

	public void forgotPwd() {
		System.out.println("forgot Pwd");
	}

}
