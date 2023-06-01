package OOP_Interface;

// first extends and then implements 

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	int min_fee = 50;

	// US
	@Override
	public void physioService() {
		System.out.println("FH - physioServices");
	}

	@Override
	public void carioService() {
		System.out.println("FH - carioServices");
	}

	@Override
	public void dentalService() {
		System.out.println("FH - dentalServices");
	}

	// UK
	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH - pediaServices");

	}

	// India

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");

	}

	// common method :
	@Override
	public void emergencyService() {
		System.out.println("FH - emergencyServices");

	}

	// individual methods

	public void medicalTraining() {
		System.out.println("FH - medicalTraining");

	}

	public void medicalClaim() {
		System.out.println("FH - medicalClaim");

	}

	@Override
	public void covidVaccinationCamp() {
		System.out.println("FH - Covid Vaccination Camp");
	}

//	@Override
//	public void medicalTest() {
//		System.out.println("Default method -- FH medical Test");
//	}

}
