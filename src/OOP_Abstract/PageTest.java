package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		
		LoginPage lp = new LoginPage(2);
		
		System.out.println("------------------");

		
		lp.title();
		lp.url();
		lp.pageLoadTimeOut();
		lp.forgotPwd();
		Page.footer();
		System.out.println("------------------");
		
		
		Page p = new LoginPage(); // top casting
		
		p.title();
		p.url();
		p.pageLoadTimeOut();
		p.displayLogo();
		Page.footer();
		
		
	//	LoginPage p1 = new Page(); // NA downCasting
		
		Page p2 = new SearchPage();
		p2.pageLoadTimeOut();
	}

}
