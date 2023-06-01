package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		// accessing variable from interface

		System.out.println(USMedical.min_fee);

		// USMedical.min_fee = 100; because final in nature

		System.out.println(USMedical.isApproved);

	//  System.out.println(FortisHospital.min_fee);

		FortisHospital fh = new FortisHospital();

		// accessing variable from class (class variable)

		System.out.println(fh.min_fee);

		fh.carioService();
		fh.dentalService();
		fh.emergencyService();
		fh.pediaServices();
		fh.neuroServices();
		fh.medicalClaim();
		fh.medicalTraining();

		fh.medicalRD();

		// top casting : child class object can be referred by parent interface
		// reference variable
		USMedical us = new FortisHospital();

		us.carioService();
		us.dentalService();
		us.physioService();
		us.emergencyService();

		UKMedical uk = new FortisHospital();

		uk.neuroServices();
		uk.pediaServices();
		uk.emergencyService(); // common method

		IndianMedical in = new FortisHospital();

		in.oncologyServices();
		in.orthoServices();
		in.emergencyService();

		WHO wh = new FortisHospital();
		wh.covidVaccinationCamp();

		// down casting : NA

		// call static method

		USMedical.billing();

		// calling default method
		fh.medicalTest(); // by implementing class object
		us.medicalTest(); // by top casting

	}

}
