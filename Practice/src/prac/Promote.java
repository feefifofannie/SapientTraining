package prac;

/**
 * 
 * @author dredmo
 *
 */
class Promote {
	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		final byte b = 42;
		final char c = 'a';
		final short s = 1024;
		final int i = 50000;
		final float f = 5.67f;
		final double d = .1234;
		final double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}
}
