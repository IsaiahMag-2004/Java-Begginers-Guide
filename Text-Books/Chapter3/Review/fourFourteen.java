/**
 What we learned  in the last section:
 - User charachter input
 - The If statement
 		- Blocked
 		- non-code block
 - Else
 	- Optional
 	- Dosnt require a conditional statement
*/

public class fourFourteen {
	public static void main(String[] args) throws java.io.IOException {
		
		char guess, answer = 'h';
		
		System.out.println("Enter a charachter between a and z including a or z: ");
		
		guess = (char) System.in.read();
		
		if (guess == answer) System.out.println("!!!!CORRECT!!!!");
		else System.out.println("!!!WRONG!!!");
	}
}