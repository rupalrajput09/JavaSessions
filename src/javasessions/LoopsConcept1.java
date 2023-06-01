package javasessions;

public class LoopsConcept1 {

	public static void main(String[] args) {

		for(double d = 1.1; d <=5.0 ;d++) {
			System.out.println(d);
		}
		
		for(int w = 1; w <= 10; w++) {
			if(w % 2 == 0) {
				System.out.println(w);
			}
		}
		
		// performance wise while loop and for loop are equally good.
		
		//use case of while loop:
		// when number of iterations are not fixed
		//total number of links/ images on page - amazon
		// webtable pagination 123...next
		// web element is loading on the page 
		// page load time out
		// calendar: 
		// build is running 
		
		//use case of for loop:
		// when number of iterations are fixed
		// month drop down --> 1 to 12
		// day drop down --> 31 days
		// category options - bigbasket
		// Arrays, ArrayList
		// excel file -- test data -- row = 1 to rowSize()
		// Country drop down
		// Read data : JSON/XML
		//read data from database: SQL -- row/ column
		
		// do-while loop 
		
		int e = 1;
		do {
			e++;
			System.out.println(e);
			//e++;
		}
		while(e <= 10);
		//while(e >= 10);
		
		int f = 1;
		do {
			f++;
			System.out.println(f);
			break;
		}
		while(e <= 10);

		// use cases of do while loop
		// web table pagination: check if element is already present in the table, click on it and end the loop
		// go and check the element first and then start the while loop
		// calendar: 
		
	}

}
