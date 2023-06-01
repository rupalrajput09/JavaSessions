package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class EmptyArrayList {

	public static void main(String[] args) {

		ArrayList<String> cityName = new ArrayList<String>(Arrays.asList("Noida", "Delhi", "Meerut", "Pune"));
		
		System.out.println(cityName);
		
		cityName.removeAll(cityName);
		System.out.println(cityName);	
	}
}
