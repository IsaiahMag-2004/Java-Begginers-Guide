/**
 Create a Program which outputs the syntax of the if statement, and switch statemet
 @author Isaiah Magana
 
 Main.java
*/

public class Main {
	public static void main(String[] agrs) throws java.io.IOException {
		
		char choice;
		
		System.out.println("Help on: \n\t1. if\n\t2. switch");
		System.out.print("Chose One: ");
		
		choice = (char) System.in.read();
		
		//Output propper choice
		switch (choice) {
			case '1':
				System.out.println("The if:\n\nif(condition) statement;\nelse statement;");
				break;
			case '2':
				System.out.println("switch(expression) {\n\tcase constant1:\n\t\tstatement sequence\n\t\tbreak;\n\tcase constant2:\n\t\tstatement sequence\n\t\tbreak;\n\tcase constant3:\n\t\tstatement sequence\n\t\tbreak;");
				break;
		}
	}
}