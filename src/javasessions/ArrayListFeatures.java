package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>(20);
		// vc = 20, pc = 0
		// lf = 20/2 = 10
		
		// vc = 5, pc = 0;
		// pc = 5, lf = 5/2 = 2
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>(20);
		// vc = 20, pc = 0
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		
		System.out.println(numList.size()); //4
		
		numList.remove(2);
		System.out.println(numList.size()); //3
		System.out.println(numList.get(2)); //400
		System.out.println(numList); //[100, 200, 400]
		
	//	numList.remove(100); //IndexOutOfBoundsException
		numList.remove(0);
		System.out.println(numList); //[200, 400]

		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "Peter", "Robin","Ravi")); // another way of adding values

		System.out.println(empList); // [Tom, Peter, Robin, Ravi]
		
		empList.add("Lisa");
		System.out.println(empList.size()); //5
		System.out.println(empList); // [Tom, Peter, Robin, Ravi, Lisa]
		
		empList.add(0, "Ankit");
		System.out.println(empList);// [Ankit, Tom, Peter, Robin, Ravi, Lisa]
		
//		empList.add(8, "Vijay"); //IndexOutOfBoundsException: Index: 8, Size: 6
//		System.out.println(empList);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println(nums.size()); // 5
		
		List<String> pagesList = Arrays.asList("Login Page", "Home Page", "Reg Page", "Cart Page");
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		// vc = 10, pc = 0
		
		nList.add(100);
		nList.add(260);
		nList.add(10);
		nList.add(4000);
		nList.add(40);
		nList.add(5);
		
		System.out.println(nList); //[100, 260, 10, 4000, 40, 5]
		
		Collections.sort(nList); // sorting list		
		System.out.println(nList); // [5, 10, 40, 100, 260, 4000]
		
		Collections.reverse(nList); // reverse the arraylist
		System.out.println(nList); // [4000, 260, 100, 40, 10, 5]
		
		int test[] = {23,2,45,100,1,900};
		Arrays.sort(test); // sorting static array
		System.out.println(Arrays.toString(test)); // [1, 2, 23, 45, 100, 900]
		
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5, "iphone"));
		System.out.println(myList.size()); // 5
		System.out.println(myList); // [iphone, iphone, iphone, iphone, iphone]
		
		
		
		
		
		
	}

}
