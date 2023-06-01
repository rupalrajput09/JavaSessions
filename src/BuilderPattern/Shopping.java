package BuilderPattern;

public class Shopping {

	public Shopping login() {
		System.out.println("Login to app ");
		return this; // /current class (Shopping) object
	//	return new Shopping(); // every time it will create a new object
	}

	public Shopping login(String un, String pwd) {
		System.out.println("Logged in : - " + un + " " + pwd);
		return this;
	}

	public Shopping search() {
		System.out.println("product search ");
		return this;

	}

	public Shopping search(String name) {
		System.out.println("product search " + name);
		return this;
	}

	public Shopping addToCart(String name) {
		System.out.println("Added item :- " + name);
		return this;
	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("Making payment with : - " + cc + " " + cvv);
		return this;
	}

	public Shopping doPayment(String upi) {
		System.out.println("Making payment with : - " + upi);
		return this;
	}

	public Shopping generateOrder() {
		System.out.println("Your order is 1234");
		return this;
	}

	public Shopping logout() {
		System.out.println("logout");
		return this;
	}
}
