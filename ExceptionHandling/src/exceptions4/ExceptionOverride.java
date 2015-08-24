package exceptions4;

import java.sql.SQLException;
import java.io.EOFException;
import java.io.IOException;


class Base {
	public void test() throws SQLException, IOException {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void test() throws EOFException {
		System.out.println("Derived");
	}
}

public class ExceptionOverride {
	public static void main(String[] args) {
		Base b = new Base();
		try {
			b.test();
		} catch (IOException e){
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
