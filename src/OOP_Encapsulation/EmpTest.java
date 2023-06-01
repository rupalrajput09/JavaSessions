package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		// private values can be accessed by public methods and constructors 	 	
		
		// POST -- create
		Employee e1 = new Employee("Aarush", 25, 12.33, "Pune", "India");
		
		 // GET -- retrieve
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		System.out.println(e1.getCountry());
		
		// PUT -- update 
		e1.setAge(26);
		e1.setSalary(20.36);

		System.out.println(" ------------ ");
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());
		System.out.println(e1.getCountry());
		
		// e1.name = "Tom"; // can't access private data

//		e1.setName("Aarush");
//		e1.setAge(25);
//		e1.setSalary(12.33);
//		e1.setCity("Pune");
//		e1.setCountry("India");
		
//		String n1 = e1.getName();
//		System.out.println(n1);
//		
//		System.out.println(e1.getAge());
//		System.out.println(e1.getCity());
//		System.out.println(e1.getSalary());
//		System.out.println(e1.getCountry());

	}

}
