package finallyexample;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("java.util.Darte");  //throws exception
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("end");  //executes whether or not exception occurs, if try block is entered
		}

	}

}
