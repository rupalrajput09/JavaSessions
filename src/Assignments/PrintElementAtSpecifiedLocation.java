package Assignments;

import java.util.ArrayList;

public class PrintElementAtSpecifiedLocation {

	public static void main(String[] args) {

		ArrayList<Integer> item = new ArrayList<Integer>();

		item.add(100);
		item.add(325);
		item.add(1002);
		item.add(400);
		
		System.out.println(item.get(2));
		System.out.println(item.get(1));
	}
}
