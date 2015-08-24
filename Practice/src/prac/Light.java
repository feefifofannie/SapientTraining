package prac;

// Compute distance light travels using long variables.
/**
 * 
 * @author dredmo
 *
 */
class Light {
	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		final int lightspeed = 186000;
		final long days = 1000;
		final long seconds = days * 24 * 60 * 60;
		final long distance = lightspeed * seconds;

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}