package pack1;

/**
 * 
 */

/**
 * @author dredmo
 *
 */
public class Math {
	
	private String privf;
	String deff;
	protected String prof;
	public String pubf;
	
	/**
	 * This method calculates the sum of two integers.
	 * @param num1 This parameter is the first number.
	 * @param num2 This parameter is the second number.
	 * @return The sum of the two parameters.
	 */
	public int sum(int num1, int num2){
		return num1+num2;
	}
	
	/**
	 * Example of varargs as a parameter. This lets you pass as many values as you want as parameters.
	 * Zero values is also possible.
	 * @param nums
	 * @return
	 */
	public int sum(int...nums){
		int sum = 0;
		for (int x : nums){
			sum += x;
		}
		return sum;
	}
	
	public void test1(){
		privf = "Private";
		deff = "Default";
		prof = "Protected";
		pubf = "Public";
		System.out.println(privf);
		System.out.println(deff);
		System.out.println(prof);
		System.out.println(pubf);
	}
}
