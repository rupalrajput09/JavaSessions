package JavaPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String s = "     Hello    World     ";

		System.out.println(s.replaceAll("\\s", ""));

		// get to
		
		String st = "Welcome to the world";
//		System.out.println(st.split(" ")[1]);
		
		String arr[] = st.split(" ");		
		System.out.println(arr[1]);
		
		System.out.println(st.indexOf("to"));//8
		
		System.out.println(st.substring(st.indexOf("to"), st.indexOf("to")+3)); //to
		
		// third occuence of i 
		
		String test = "hi this is my java code i am so happy";
		
		System.out.println(test.indexOf("i"));//1
		System.out.println(test.indexOf("i", test.indexOf("i")+1));//5
		System.out.println(test.indexOf("i", test.indexOf("i", test.indexOf("i")+1)+1)); //8
		
		System.out.println(test.indexOf("i", test.indexOf("i", test.indexOf("i", test.indexOf("i")+1)+1)+1));//24
		
		//loop : give me all the occurrence of i
		
		 
		
		
		
	}

}
