package OOP_Inheritance;

public class Car extends Vehicle {

	// final :
	// is used to prevent inheritance
	// is used to prevent method overriding
	// is used for constant values

	// static method cannot be overridden
	// static method can be inherit in child class
	// private method cannot be overridden
	// final method cannot be overridden

	public final void service() {
		System.out.println("Car Service");
	}

	public void start() {
		System.out.println("Car -- start ");
	}

	public void stop() {
		System.out.println("Car -- stop ");
	}

	public void refuel() {
		System.out.println("Car -- refuel ");
	}

	@Override
	public void petrolEngine() {
		System.out.println("Car --- petrol engine");
	}

	public static void billing() {
		System.out.println("Car -- Billing");
	}

	private void pickColor() {
		System.out.println("Car - pick color");
	}

}
