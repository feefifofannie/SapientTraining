package prac;

// Compute the area of a circle.
/**
 * 
 * @author dredmo
 *
 */
class Area {
	public static void main(final String[] args) {
		final double pi = 3.1416;
		final double radius = 10.8;
		double area;

		area = pi * radius * radius; // compute area

		System.out.println("Area of circle is " + area);
	}
}