package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		// with new keyword
		
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a[3]);
		System.out.println(a[0]);
		System.out.println(a[-1]); // ArrayIndexOutOfBoundsException(AIOB)

		
		int len = a.length;
		System.out.println("Length of the array => " + len);
	 
		// hi => higher index , li => lower index
		
		int hi = len - 1;
		System.out.println("Higher Index => " + hi);
		
		int li = 0;
		System.out.println("Lower Index => " + li);
		
		System.out.println("--------------");
		
		// printing all the array elements using for loop
		
		for(int i = 0; i < len ; i++) {
			System.out.println(a[i]); // 10 20 30 40
		}
		
		// printing all the array elements without using for loop
		
		System.out.println(Arrays.toString(a));
		System.out.println(a); // [I@379619aa Memory address of a
		
		// double array
		double d[] = new double[2];
		d[0] = 10.36;
		d[1] = 18.55;
		System.out.println(d[0] + d[1]);
		
		// String Array 
		String emp[] = new String[3];
		emp[0] = "Pooja";
		emp[1] = "Ravi";
		emp[2] = "Robbin";
		
		System.out.println(emp[1]);
		System.out.println("Total Emp => " + emp.length);
		System.out.println(Arrays.toString(emp));
		
		for(int j = 0; j < emp.length; j++) {
			System.out.println(emp[j]);
			if(emp[j].equals("Ravi")) {
				System.out.println("Ravi Salary is =>" + 1000);
				break;
			}
		}
 		
		// static array ex: months, days , seats in plane , movie hall etc.
		
	}

}
