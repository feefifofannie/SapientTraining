package prac;

//Demonstrate dynamic initialization.
/**
 * 
 * @author dredmo
 *
 */
class DynInit {
	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		final double length = 3.0; 
		final double height = 4.0;

		// c is dynamically initialized
		double hypotenuse = Math.sqrt(length * length + height * height);

		System.out.println("Hypotenuse is " + hypotenuse);
	}
}