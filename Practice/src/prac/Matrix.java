package prac;

//Initialize a two-dimensional array.
/**
 * 
 * @author dredmo
 *
 */
class Matrix {
	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		double m[][] = { { 0 * 0, 1 * 0, 2 * 0, 3 * 0 },
						 { 0 * 1, 1 * 1, 2 * 1, 3 * 1 }, 
						 { 0 * 2, 1 * 2, 2 * 2, 3 * 2 },
						 { 0 * 3, 1 * 3, 2 * 3, 3 * 3 } };
		
		for (int counter1 = 0; counter1 < 4; counter1++) {
			for (int counter2 = 0; counter2 < 4; counter2++)
				System.out.print(m[counter1][counter2] + " ");
			System.out.println();
		}
	}
}