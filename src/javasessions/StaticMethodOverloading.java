package javasessions;

public class StaticMethodOverloading {

	public static void login() {
		
	}
	
	public static void  login(int i) {
		
	}

	public static void login(int i, int j) {
	
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(10, 20);
		
		StaticMethodOverloading obj = new StaticMethodOverloading();
		obj.main(100, 12.3);
		
// src code (.java) --compiler time --> .class(decision of method calling) --> JVM --> Run it --> machine code (OS)		
		
	}
	
//	public static void main(String[] test) { // duplicate method
//		System.out.println("Main method");
//	}
	
	
	// non static , will be called by object of class, but not a good practice , only interview question
	public void main(int a, double d) { 
		System.out.println("main method " + a + d);
	}
	
	public static void main(int a) { // normal variable
		System.out.println("main method " + a);
	}
	
	public static void main(int []a) { // int array variable 
		System.out.println("main method " + a);
	}
	
	public static void main(String a) { // normal variable 
		System.out.println("main method " + a);
	}
	
	
	public static void main(int a, int b) {
		System.out.println("main method " + a + b); // main method2030 (String concate nation)
	}

	// main method can be overloaded
}
