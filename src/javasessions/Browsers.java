package javasessions;

public class Browsers {

	String name;
	static String hq = "Bangalore";
	
	public int getBrowserVersion() {
		System.out.println("get browser version");
		return 100;
	}
	
	public static String getBrowserVendor() {
		System.out.println("get browser vendor");
		return "Mozilla";
	}
	
	// entry point of execution
	// runner method
	// calling method
	// behaving like a user for me
	public static void main(String[] args) {

		Browsers obj = new Browsers();
		
		System.out.println(obj.name);
		System.out.println(hq); // directly 
		System.out.println(Browsers.hq); // using class name
		
		obj.getBrowserVersion();
		
		getBrowserVendor(); // directly
		
		Browsers.getBrowserVendor(); // using class name
		
		obj.name = "Hari";
		
		obj.hq = "Pune"; // warning is given, should be accessed in a static way
		obj.getBrowserVendor(); // warning is given, should be accessed in a static way
		
		//object cannot hold static properties (variable , method)
		// static will be stored in CMA (common memory allocation, permanent generation, Metaspace)
		// Object can call/ access static properties but with a warning
		// you should always call static with the class
		// 10 objects --> static copies = 1
		// 10 objects --> non static copies = 10
		
		// permanent generation vs metaspace
		// both are same thing both are representing the same area 
		// but metaspace came into the picture after jdk1.8 and permanent generation was there till jdk1.7
		// permanent generation is a static memory and metaspace is a dynamic memory
					
	}

}
