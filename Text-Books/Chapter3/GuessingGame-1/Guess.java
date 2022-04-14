/**
 Creates a basic guessing game in java
 Program requests a letter from the user, and if is right will return a winning message
*/

public class Guess {
	public static void main(String[] args) throws java.io.IOException {
		
		char answer = 'a', guess; //letter to guess
		
		System.out.println("Guess a letter between a and z Including a or z: ");
		guess = (char) System.in.read(); //Collects the users data
		
		if (guess == answer) System.out.println("** Right **");
		
		else {
			//Nested if 
			if (guess > answer) System.out.println("Your To High");
			else System.out.println("Your to low");
		}
		
	}
}