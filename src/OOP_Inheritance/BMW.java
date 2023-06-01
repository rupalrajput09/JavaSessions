package OOP_Inheritance;

public class BMW extends Car {

	// IS - A relationship

	// Method Overriding: Poly + Morphism --> Run Time (Dynamic)
	// when you have a method in parent class and the same method in child class:
	// with the same name
	// with the same number of parameters
	// with the same sequence of parameters
	// with the same return

	@Override // annotation
	public void start() {
		System.out.println("BMW -- start ");
	}

	public void autoParking() {
		System.out.println("BMW-- autoParking ");
	}

	@Override
	public void petrolEngine() {
		System.out.println("BMW --- petrol engine");
	}

	// method hiding : when you have a static method in parent and the same static
	// method in child class.
	// billing() is an individual method of BMW class
	// static method cannot be overridden

	public static void billing() {
		System.out.println("BMW -- Billing");
	}

	private void pickColor() {
		System.out.println("BMW - pick color");
	}
}
