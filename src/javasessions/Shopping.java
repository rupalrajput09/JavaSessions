package javasessions;

public class Shopping {

	// Method Overloading:
	// within the same class, if you have number of methods:
	// 1. with the same name
	// 2. with the different parameters
	// 3. with the different number of parameters
	// 4. with the different order of the parameters
	// 5. return type doesn't matter

	public void test() {
		System.out.println("test method");
	}

	public void test(int i) {
		System.out.println(i);
	}

	public void test(int i, int j) {
		System.out.println(i + j);
	}

	public void test(String p) {
		System.out.println(p);
	}

	public void test(String p, int q) {
		System.out.println(p + q);
	}

	public void test(int p, String q) {
		System.out.println(p + q);
	}

	// method overloading use case real time example:

	public void login() {
		System.out.println("Login");
	}

	public void login(String un, String pwd) {
		System.out.println("Login with user name and password");

	}

	public void login(String un, String pwd, String role) {
		System.out.println("Login with user name and password and role credentials");
	}

	// search

	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// payment : feature using upi, cc, dc, paypal, stripe
	// --> method

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(int cvv, String dc) {

	}

	public void doPayment(String paypal, String pwd, int otp) {

	}

	public void doPayment(String StripeId, int otp, String key) {

	}

	// uber : booking

	public void booking(String carType, String fromLocation, String toLocation) {

	}

	public void booking(String carType, String fromLocation, String toLocation, int passenger) {

	}

	public void booking(String carType, String fromLocation, String toLocation, String paymentOption) {

	}

	public static void main(String[] args) {

		Shopping shop = new Shopping();
		shop.login();
		shop.login("Hello", "Password");
		shop.login("Tom", "abc", "Manager");
	}

}
