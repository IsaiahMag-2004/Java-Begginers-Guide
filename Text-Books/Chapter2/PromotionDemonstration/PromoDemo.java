/**
 Example of the type conversion rule in java, and its unexpected nature to those who have never used it
*/

class PromoDemo {
	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10; 
		i = b * b; // OK, no cast needed
		
		b = 10;
		b = (byte) (b * b); //Cast is needed
		
		System.out.println(" i and b: " + i + " " + b);
	}
}