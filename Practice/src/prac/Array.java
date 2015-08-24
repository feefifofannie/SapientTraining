package prac;

//Demonstrate a one-dimensional array.
/**
 * 
 * @author dredmo
 *
 */
class Array {
	public static void main(final String[] args) {
		int monthEndDay[];
		monthEndDay = new int[12];
		monthEndDay[0] = 31;
		monthEndDay[1] = 28;
		monthEndDay[2] = 31;
		monthEndDay[3] = 30;
		monthEndDay[4] = 31;
		monthEndDay[5] = 30;
		monthEndDay[6] = 31;
		monthEndDay[7] = 31;
		monthEndDay[8] = 30;
		monthEndDay[9] = 31;
		monthEndDay[10] = 30;
		monthEndDay[11] = 31;
		System.out.println("April has " + monthEndDay[3] + " days.");
	}
}