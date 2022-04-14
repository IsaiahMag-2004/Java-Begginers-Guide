/**
	Example of charachter input in java
*/

public class KbIn {
	public static void main(String[] agrs) throws java.io.IOException {
			
			char ch;
			
			System.out.println("Press a key followed by ENTER: ");
			
			ch = (char) System.in.read(); //Read a character
			
			System.ou.println("Your key is: " + ch);
			
	}
}