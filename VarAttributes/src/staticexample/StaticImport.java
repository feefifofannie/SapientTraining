package staticexample;

import static javax.swing.JOptionPane.*;

/**
 * Static import used when you don't want to prefix the name of the class
 * Used when referencing variables from some package many times
 * @author dredmo
 *
 */
public class StaticImport {

	public static void main(String[] args) {
		showMessageDialog(null, "Hello Sapient", "tile", INFORMATION_MESSAGE);
	}

}
