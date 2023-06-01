package Assignments;

import java.util.ArrayList;

public class PrintingAllElementOfArrayList {

	public static void main(String[] args) {

		ArrayList<String> bankName = new ArrayList<String>();
		
		bankName.add("ICICI");
		bankName.add("SBI");
		bankName.add("HDFC");
		bankName.add("OBC");
		
		for(int i = 0; i < bankName.size(); i++) {
			System.out.println(bankName.get(i));
		}		
	}
}
