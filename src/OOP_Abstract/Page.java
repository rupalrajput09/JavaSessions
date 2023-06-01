package OOP_Abstract;

public abstract class Page {
	
		// can not create the object of abstract... class
		// but can create the constructor... of abstract class
		// and this constructor.. will be called when we create the object of child class
		
		//100% abstraction
		//0% abstraction
		//partial abstraction

	public Page() {
		System.out.println("Parent Page class -- Default constructor..");
	}
	
	public Page(int i) {
		System.out.println("Page class -- Default constructor.." + i);
	}
	
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void pageLoadTimeOut() {
		System.out.println("Page time out -- 10 seconds");
	}

	public final void displayLogo() {
		System.out.println("Display Logo");
	}

	public static void footer() {
		System.out.println("Page footer ");
	}

}
