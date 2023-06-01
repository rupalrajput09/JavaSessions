package OOP_Inheritance;

public class TestCar {
// TestCar class is working as a runner for Vehicle, Car and BMW class

	public static void main(String[] args) {

		BMW b = new BMW();

		b.start(); // BMW -- start , // Overridden method , run polymorphism

		b.stop(); // Car -- stop , // inherited method

		b.refuel(); // Car -- refuel , // inherited method

		b.autoParking(); // BMW-- autoParking , // Individual method - BMW's own method

		b.engine(); // vehicle --- engine , // inherited method

		b.petrolEngine(); // BMW --- petrol engine, // Overridden method

		BMW.billing(); // BMW -- Billing

		System.out.println("-------------");

		// parent class access only those which are available in parent class
		Car c = new Car();
		c.start(); // Car -- start
		c.stop(); // Car -- stop
		c.refuel(); // Car -- refuel

		c.engine(); // vehicle --- engine // inherited method
		c.petrolEngine(); // Car --- petrol engine

		Car.billing(); // Car -- Billing

		// preference will always be given to the last overridden method

		System.out.println("-------------");
		Truck t = new Truck();
		t.loading(); // truck --- loading

		Audi a = new Audi();
		a.thefySafety(); // Audi -- theftsafety

		a.engine(); // vehicle --- engine

		System.out.println("-------------");
		// child class object can be referred by parent class reference variable
		// Top / Up casting -- can access only overridden and inherited methods
		// See the object , don't go with the reference name
		// Here BMW car is on the road but Car class object is driving , So only BMW
		// features(methods) will be called

		Car c1 = new BMW();
		c1.start(); // BMW -- start
		c1.stop(); // Car -- stop
		c1.refuel(); // Car -- refuel
		c1.petrolEngine(); //

		// c1.autoParking(); not allowed b'coz this is BMW individual method , reference
		// type is not matched/ failed

		// reference type checked will be failed for the individual methods with the top
		// casting

		// child class object can be referred by grand parent class reference variable
		Vehicle v1 = new BMW();
		v1.engine(); // vehicle --- engine
		v1.petrolEngine(); // BMW --- petrol engine

		// down casting
		// down casting is allowed at compile time but at run time it will give you
		// ClassCastException
		// parent class object can be referred by child class reference variable

		// BMW b1 = (BMW)new Car(); // java.lang.ClassCastException: class
		// OOP_Inheritance.Car cannot be cast to class OOP_Inheritance.BMW
		// (OOP_Inheritance

	}

}
