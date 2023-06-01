package UseOfSuper;

public class Car {
	
	String name;
	int price;
	
	int min_speed = 100;
//	private int min_speed = 100;
	
	
	public void display() {
		System.out.println("Car display method ");
	}
	
	public Car(String name, int price) {
		System.out.println("Car name :- "+ name + "price :- " + price);
		this.name = name;
		this.price = price;
	}
	
	public Car() {
		System.out.println("Car Default Cons...");
	}

}
