package Assignments;

public class UpdateArrayElement {

	public static void main(String[] args) {

		int ele[] = new int[4];
		
		ele[0] = 10;
		ele[1] = 20;
		ele[2] = 30;
		ele[3] = 40;
		
		for(int element : ele) {
			System.out.println(element); // 10 20 30 40
		}
		
		// updating element
		
		ele[1] = 25;
		
		for(int element : ele) {
			System.out.println(element); // 10 25 30 40
		}
		
	}

}
