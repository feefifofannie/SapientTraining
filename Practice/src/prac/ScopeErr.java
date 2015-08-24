package prac;

//This program will not compile
/**
 * 
 * @author dredmo
 *
 */
class ScopeErr {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int bar; 
		{ // creates a new scope
			bar = 2; // Compile time error -- bar already defined!
		}
	}
}