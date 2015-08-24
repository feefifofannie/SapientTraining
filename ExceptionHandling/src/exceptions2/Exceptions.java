package exceptions2;

public class Exceptions {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("java <MainClass> <first_number> <second_number>");
		} catch (ArithmeticException e){
			System.out.println("You cannot divide by zero.");
		} catch (NumberFormatException e){
			System.out.println("Please provide valid numbers.");
		} catch (Exception e){
			//this will catch all errors of any type, known as default exception handler
			e.printStackTrace();
		}
	}

}

/*
 * To run in the command line with arguments: D: 
 * cd \workspace\SapientTraining\ExceptionHandling 
 * java -cp bin exceptions2.Exceptions 9 3
 * add any arguments you want to the end
 */