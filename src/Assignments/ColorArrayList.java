package Assignments;

import java.util.ArrayList;

public class ColorArrayList {

	public static void main(String[] args) {

		ArrayList<String> colorList = new ArrayList<String>();
		
		colorList.add("Blue");
		colorList.add("Orange");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Peach");
		
		System.out.println(colorList);
		
		System.out.println(colorList.get(0));
		
		// Using for each loop
		for(String color : colorList) {
			System.out.println(color);
		}		
	}
}
