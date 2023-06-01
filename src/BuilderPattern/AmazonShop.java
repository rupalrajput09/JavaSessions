package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {

		Shopping shop = new Shopping();

		// scenario 1
		shop.login("phool@gmail.com", "phool@123")
		.search("Suit")
			.addToCart("Suit")
				.doPayment("1235")
					.logout();

		// scenario 2

		shop.login("hello@yahoo.com", "hello@123").doPayment("124 215 247", 126).logout();

		// scenario 3

		shop.login().logout().login();

	}

}
