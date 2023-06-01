package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> element = new ArrayList<Integer>(Arrays.asList(1,5,4,8,9));
		
		System.out.println(element); 
		
		element.remove(2);
		System.out.println(element); 
		
	}
}
