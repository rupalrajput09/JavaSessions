package UseOfSuper;

public class BMW extends Car {

	private int min_speed = 200;
	
	@Override
	public void display() {
		System.out.println("BMW display method ");
		super.display(); // can be used any position you want
	}
	
	
	
	public void speedCal() {
		System.out.println(min_speed);
		
		int carSpeed = super.min_speed;
		int diff = min_speed - carSpeed;
		System.out.println("Diff :- "+ diff);
		
	}
	
	public BMW() {
		super("BMWx10", 98); // BMW is calling super class constructor
		System.out.println("BMW Cons...");
	}


	public BMW(int price) {
		super("Audi", 50); // BMW is calling super class constructor
		System.out.println("BMW param Cons...");
	}

	
}
