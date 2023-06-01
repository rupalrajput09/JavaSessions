package javasessions;

import java.util.Arrays;

public class LoopsWithForEachLoop {

	public static void main(String[] args) {

		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		for(int e : a) {
			System.out.println(e);
		} // O(n)
		System.out.println(a[2]); // 30 --> O(1)

		
		String emp[] = new String[5]; // 0-4
		System.out.println("Value of emp[0] :- " + emp[0]);// null
		emp[0] = "Pooja";
		emp[1] = "Ravi";
		emp[2] = "Robbin";
		emp[3] = "Vikas";
		emp[4] = "Akhil";
		
		for(String name : emp) {
			System.out.println(name);
			if(name.equals("Vikas")) {
				System.out.println("He is a developer");
				//break;
			}
		}

		Object employee[] = new Object[5];		
		employee[0] = "Tom";
		employee[1] = 30;
		employee[2] = 23.33;
		employee[3] = 'm';
		employee[4] = true;
			
		for(Object e : employee) {
			System.out.println(e);
		}
		
		int ar[] = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		
		for(int i = ar.length-1; i >= 0; i--) {
			System.out.println(ar[i]);
		}
		
		System.out.println("---------------");
		int pr[] = new int[4];
		System.out.println(pr[0]);
		pr[0] = 1000;
		System.out.println(pr[0]);

		int test[] = {10,20,40,55,66,77,88,909}; // static array
		System.out.println(test.length); // 8
		System.out.println(test[0]);//10
		System.out.println(test[7]); // 909
	//	System.out.println(test[8]); // AIOB
		
		test[0] = 400;// O(1) , updating the value
		System.out.println(test[0]); //400
		
	//	test[8] = 600;// AIOB
	//	System.out.println(test[8]); 
		
		test[3] = 99;// updating value 
		System.out.println(test[3]); // 99
		
		System.out.println(Arrays.toString(test));
	}

}
