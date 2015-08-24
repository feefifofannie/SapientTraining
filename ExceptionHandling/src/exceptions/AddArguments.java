package exceptions;

public class AddArguments {

	public static void main(String[] args) {
		int sum = 0;
		try {
			for (String arg : args) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe) {
			System.err.println("One of the command line arguments is not an integer");
		}
	}
}

/*
 * To run in the command line with arguments: D: 
 * cd \workspace\SapientTraining\ExceptionHandling 
 * java -cp bin exceptions.AddArguments 1 2 3 4
 * add any arguments you want to the end
 */
