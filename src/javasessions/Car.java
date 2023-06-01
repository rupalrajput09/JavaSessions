package javasessions;

public class Car {

	String name;
	String color;
	int price;
	static final int wheels = 4;
	
	// static is only for class variables	
	// static is common property for all objects
	// but object will not hold the static property
	// static variable will be stored in CMA (Common memory allocation)
	// and it will create only one copy for all the objects
	
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "White";
		c1.price = 80;
	//	c1.wheels = 4; // not the right way
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "Red";
		c2.price = 70;
	//	c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.color = "Black";
		c3.price = 20;
	//	c3.wheels = 4;

		// how to access static variable
		// using the class name
		
		System.out.println(c1.name + " "+ c1.color + " " + c1.price + "  " + Car.wheels );
		System.out.println(c1.wheels); // not a right way of calling static variable using reference name
		System.out.println(wheels); // 
	//	System.out.println(name); // non static 
		System.out.println(c1.name);
		
		
		System.out.println(c2.name + " "+ c2.color + " " + c2.price + "  " + Car.wheels );
		
		System.out.println(c3.name + " "+ c3.color + " " + c3.price + "  " + Car.wheels );

	}

}
