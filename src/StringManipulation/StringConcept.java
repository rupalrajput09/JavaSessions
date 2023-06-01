package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		// String Literals:
		
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		
		if(s2.equals(s1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println(s==s1);//true
		System.out.println(s1==s2); // false
		
		// String Objects with new keyword
		
		String st = new String("Java");
		String st1 = new String("Hello");

		String st2 = new String("Selenium");
		st2.intern();
		System.out.println(st2.length());
		
		String st3 = new String();
		System.out.println(st3.length());


		
		System.out.println(st.equals(st1));
		
		
		
	}

}
