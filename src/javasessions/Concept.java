 package javasessions;

import java.util.ArrayList;

public class Concept {

		// WAF:
		// supply a browser name : String: chrome/ff/safari/IE
		// buss logic: launch the browser
		// return true
	
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser Name -- " + browserName);
		boolean flag = true;
		
		switch(browserName.toLowerCase().trim()) {
		
		case "chrome":
			System.out.println("Launch chrome");
			break;
			
		case "firefox":
			System.out.println("Launch firefox");
			break;
			
		case "safari":
			System.out.println("Launch safari");
			break;
			
		case "ie":
			System.out.println("Launch ie");
			break;
		
		default:
			System.out.println("Pls pass the right browser .. " + browserName);
			flag = false;
			break;
		}
		return flag;
	}
	
	public void testing() {
		System.out.println("here we return nothing, its a blank return that is equivalent to void");
		System.out.println("This method return nothing ");
		return;
	}
	
		// WAF:
		// supply input parameter: Company Name (String): IBM, MS, Google
		// return : the list of employee of the company: ArrayList<String>
		// use dynamic array b'coz list of employee is not fixed
	
	public ArrayList<String> getEmpList(String compName) {
		System.out.println("company name is : " + compName);

		ArrayList<String> empList = new ArrayList<String>();// pc=0

		if (compName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("Ravi");
			empList.add("Geeta");
		} else if (compName.equalsIgnoreCase("MS")) {
			empList.add("Abhi");
			empList.add("Naveen");
			empList.add("Heena");
			empList.add("Azam");
		} else if (compName.equalsIgnoreCase("Google")) {
			empList.add("Fawad");
			empList.add("Dhurv");
		} else {
			System.out.println("comp name is not found...plz pass the right comp name...");
		}

		return empList;
	}
	
		public static void main(String[] args) {
		
		Concept c = new Concept();
		
		ArrayList<String> ibmList = c.getEmpList("IBM");
		System.out.println(ibmList);
		
	
		ArrayList<String> googleList = c.getEmpList("Google");
		System.out.println(googleList);
		
		ArrayList<String> ctsList = c.getEmpList("cts");
		System.out.println(ctsList); // [] one empty/ blank list
		System.out.println(ctsList.size());
		
		ArrayList<String> msList = c.getEmpList("MS");
		System.out.println(msList); //
		System.out.println(msList.size());
		
		boolean isLaunched =c.launchBrowser("opera");
		if(isLaunched) {
			System.out.println("Enter the url");
		}
		else {
			System.out.println("don't enter the url");
		}
		
	}

}
