package javasessions;

public class PrintEquivalentCharacter {

	public static void main(String[] args) {

		int asciiValueOfd = (byte)('d');
		System.out.println("Ascii value of d :" + asciiValueOfd);
		
		int addition = asciiValueOfd + 3;
		
		System.out.println("Value will be : " + addition);
		
		System.out.println("Equivalent Character : " + (char)addition);		
	}

}
