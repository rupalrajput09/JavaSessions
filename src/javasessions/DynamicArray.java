package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
	
	//	ArrayList -- default class in Java
	// create the object of array list
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100); // 0 index
		ar.add(200); // 1 index
		
		System.out.println(ar.size());
		
		ar.add(300); // 2 index
		ar.add(400); // 3 index
		ar.add(500); // 4 index
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
	//	System.out.println(ar.get(5)); // IndexOutOfBoundsException
	//	System.out.println(ar.get(-1)); // IndexOutOfBoundsException
		
		ar.add(600);
		System.out.println(ar.get(5)); // 5th index
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("Testing");
		
		System.out.println(ar.size());
		
		// generics in ArrayList:
		
		// adding student marks
		
		ArrayList<Integer> markList = new ArrayList<Integer>(); // Virtual Capacity = 10, Physical Capacity = 0
		markList.add(1000);
		markList.add(2000);
		System.out.println(markList.size());
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(12.33);
		bmiList.add(100.25);
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome"); //0
		browserList.add("firefox");//1
		browserList.add("safari");//2
		browserList.add("opera");//3
		System.out.println(browserList.get(3));
		System.out.println(browserList.size()); //4
		
		System.out.println(browserList);
		
		// To print all the values from arraylist : for loop
		
		for(int i = 0; i < browserList.size(); i++) {
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("firefox")) {
				System.out.println("Mozilla");
				break;
			}
		}
		
		System.out.println("-----Using For each loop");
		// for each:
		for(String br : browserList) {
			System.out.println(br);
		}
		
		// emp info : name, age, salary, string, char, true
		ArrayList<Object> empInfoList = new ArrayList<Object>(); // VC = 10, PC = 0
		empInfoList.add("Riya");
		empInfoList.add("Sinha");
		empInfoList.add(30);
		empInfoList.add(45.55);
		empInfoList.add("Banglore");
		empInfoList.add('f');
		empInfoList.add(true);
		
		System.out.println("empInfoList Size");
		System.out.println(empInfoList.size());
		
		for(Object empInfo : empInfoList) {
			System.out.println(empInfo);
		}
		
		System.out.println("------------");
		System.out.println(empInfoList);
		
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.add(100); //0
		numbers.add(200);//1
		numbers.add(3000);//2
		numbers.add(100);//3
		
		System.out.println(numbers);
		
		// for(Integer num : numbers) // can also be used
		for(int num : numbers) {
			System.out.println(num);
			if(num == 200) {
				System.out.println("Got 200");
				break;
			}
		}
		
		//LF - load factor--> pc/2 --> size()/2
		//vc = 10, pc = 0
		//pc = 10, vc = 0, lastindex=0-9
		//LF = pc/2 --> 10/2 = 5
		//pc=15,vc=0, 0-14
		//LF=pc/2 --> 15/2 --> 7
		
		
		// Use Cases Of ArrayList
		// uber : carsList
		// amazon : productList
		// users list
		// total links --> LinksList
		// total images --> ImagesList 
		
	}

}
