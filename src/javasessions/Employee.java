package javasessions;

public class Employee {
	
	// class variable , class data member , global variable
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		// local variable
		//	String name = "Harry";
		//System.out.println(name);
		
		// class -- template/ blueprint of the object/ category of the object
		// object -- is a physical entity
		
		// create object of the class : new keyword
		Employee obj = new Employee();
		
		// obj is object reference name
		// object is rhs (right hand side line) i.e. new Employee();
		// Employee is the class name 
		// obj is variable name and variable type is Employee (non primitive)
		
		obj.name = "Tom";
		obj.age = 20;
		obj.city = "LA";
		
		System.out.println(obj.name + " "+ obj.age + " "+ obj.city);
		
		Employee obj1 = new Employee();
		System.out.println(obj1.name); // null , default value of String
		System.out.println(obj1.age); // 0
		System.out.println(obj1.city); // null
		
		obj1.name = "Tina";
		obj1.age = 28;
		obj1.city = "Sydney";
		
		System.out.println(obj1.name); // Tina
		System.out.println(obj1.age); // 28
		System.out.println(obj1.city); // Sydney
		
		// here we have created 3 objects one for name, one for age and one for city (not a good practice)
		// No reference object -- not recommended -- take extra space
		// always create object with reference , not without reference
		new Employee().name = "Peter"; // defined only name for this object
		new Employee().age = 25;
		new Employee().city = "Pune";
		
		
		
		
		
		
		
		
		
		
		
	}

}
