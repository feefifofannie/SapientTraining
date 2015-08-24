package exceptions3;

class IllegalAgeException extends Exception {
	public String getMessage() {
		return "You need to be 18 or above to register to vote.";
	}
}

class Vote {
	public void register(int age) throws IllegalAgeException{
		if (age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You are eligible to vote!");
	}
}

public class MakeException {
	
	public static void main(String[] args) {
		Vote v = new Vote();
		try {
			v.register(16);
		} catch (IllegalAgeException e){
			e.printStackTrace();
		}
	}

}
