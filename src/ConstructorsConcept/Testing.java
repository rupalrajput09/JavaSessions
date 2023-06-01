package ConstructorsConcept;

public class Testing {
	
	// restriction is do not make object of this class
	// private constructor is used in singleton pattern
	private Testing() {
		System.out.println("Testing ...");
		
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	
	

}
