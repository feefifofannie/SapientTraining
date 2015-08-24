package prac;

//Demonstrate block scope.
/**
 * 
 * @author dredmo
 *
 */
class Scope {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;
		if (x == 10) { // start new scope
			int y = 20;
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		System.out.println("x is " + x);
	}
}