package javasessions;

public class LoginTest {

	public static void main(String[] args) {

//		boolean b = LoginPage.forgotpwdLinkExist();
//		
//		if(b) {
//			System.out.println("Change your pwd");
//		}
		
		// OR		
		if(LoginPage.forgotpwdLinkExist()) {
			System.out.println("Change your pwd");
		}
		
		// calling doLogin() method of LoginPage
		LoginPage obj = new LoginPage();
		obj.doLogin("abc@gmail.com", "Test123");
		
		
	}

}
