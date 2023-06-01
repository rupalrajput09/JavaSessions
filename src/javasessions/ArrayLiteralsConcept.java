package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		// Array Literals 
		
		int[]a = {1,3,8,4,6,12,25};
		
		System.out.println("Length => " + a.length);
		System.out.println(Arrays.toString(a));
			
		String browser[] = {"chrome", "firefox", "IE", "edge", "safari"};
		
		for(int k = 0; k < browser.length; k++) {
			System.out.println(browser[k]);
//			if(browser[k].equals("IE")) {
//				System.out.println("This is depricated");
//			}		
		
		switch (browser[k]) {
		case "chrome":
			System.out.println("google");
			break;
		case "firefox":
			System.out.println("mozilla");
			break;

		default:
			break;
		}
	}
		int ar[] = new int[4];
		ar[0] = 100;
	//	ar[4] = 200; //ArrayIndexOutOfBoundsException
		//System.out.println(ar[4]);
		
				//amazon -- sept 2023 -- [1000] -- 1 hr 
				//oct -- 25, left=25
				//nov ---1000
				//dec -- 5000
				//25th -- 100000
				//uber
				//5 PM [100] --> [1000]
		
	}

}
