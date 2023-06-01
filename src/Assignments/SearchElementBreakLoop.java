package Assignments;

import java.util.ArrayList;

public class SearchElementBreakLoop {

	public static void main(String[] args) {

		ArrayList<String> country = new ArrayList<String>();
		
		country.add("India");
		country.add("Nepal");
		country.add("Spain");
		country.add("Canada");
		
		for(String countryList : country) {
			System.out.println(countryList);
			if(countryList.equals("Spain")) {
				System.out.println("In Europe");
				break;
			}
		}
	}
}
