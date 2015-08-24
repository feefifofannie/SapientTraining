package prac;

//Demonstrate lifetime of a variable.
/**
 * 
 * @author dredmo
 *
 */
class LifeTime {
	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		for (int counter = 0; counter < 3; counter++) {
			int lifetimeVar = -1; // y is initialized each time block is entered
			System.out.println("y iz: " + lifetimeVar); // this always prints -1
			lifetimeVar = 100;
			System.out.println("y is now: " + lifetimeVar);
		}
	}
}
