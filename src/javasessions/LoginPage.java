package javasessions;

public class LoginPage {
	
	public static boolean forgotpwdLinkExist() {
		System.out.println("checking forgot pwd link on the page");
		return true;
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login with: " + un + ":" + pwd);
		System.out.println("Logged in ");
	}
	

}
