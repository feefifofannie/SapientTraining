package rethrow;

class Test {
	public void testing(int num) throws Exception{
		try {
			if (num<3){
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}

public class RethrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
