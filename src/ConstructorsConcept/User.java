package ConstructorsConcept;

public class User {

	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
	String city;

	// Acceptance Criteria : given by product owner
	// user can be created if you have :
	// firstname , lastname
	// firstname, lastname, emailid
	// firstname
	// firstName , lastName, password, phone
	// firstName , lastName, emailid, phone, password, city

	// Generate constructors --> Right click --> Go to source --> click on Generate
	// -->
	// constructors using fields

	// method : business logic --> suppose want to calculate the tax calculation
	// method - reusability
	// constructor : used only for object creation -- restriction of the object
	// creation , cannot return anything , cannot write business logic
	// constructor : to initialize the class variable with the initial values

	// never use class name as a method name

	public User(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String firstName, String lastName, String emailId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public User(String firstName) {

		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String password, String phone) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
	}

	public User(String firstName, String lastName, String emailId, String phone, String password, String city) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}

	public void getInfo() {
		System.out.println("get info");
	}

	public void getInfo(int i) {
		System.out.println("get info" + i);
	}

	// static : class name
	// non static : object reference name
	// constructor : when we create the object

	public static void main(String[] args) {

		User u1 = new User("Ankit");
		System.out.println(u1.firstName); // Ankit
		System.out.println(u1.firstName + " " + u1.lastName); // Ankit null
		u1.lastName = "Agarwal";
		System.out.println(u1.firstName + " " + u1.lastName); // Ankit Agarwal

		User u2 = new User("Mahesh", "Kumar", "mahesh@gmail.com", "98989898", "mahesh@123", "Banglore");
		System.out.println(u2.firstName + " " + u2.lastName + " " + u2.phone); // Mahesh Kumar 98989898

		u2.city = "Pune";
		u2.phone = "125478";
		System.out.println(u2.firstName + " " + u2.lastName + " " + u2.emailId + " " + u2.phone + " " + u2.password
				+ " " + u2.city);
		// Mahesh Kumar mahesh@gmail.com 125478 mahesh@123 Pune

	}

}
