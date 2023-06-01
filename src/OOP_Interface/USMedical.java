package OOP_Interface;

public interface USMedical extends WHO {

	// variables in interface are static and final in nature (by default)

	int min_fee = 10;
	boolean isApproved = true;

	// abstract method:
	// no method body
	// only method declaration / method prototype / no business logic
	// cannot create the object of Interface

	public void physioService();

	public void carioService();

	public void dentalService();

	public void emergencyService();

	// after jdk 1.8
	// 1. we can have static method with method body

	public static void billing() {
		System.out.println("US billing -- method");
	}

	// 2. default method with method body
	default void medicalTest() {
		System.out.println("Default method -- US medical Test");
	}

	default void medicalReport() {
		System.out.println("Default method -- US medical Report");
	}
}
