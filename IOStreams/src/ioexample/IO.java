package ioexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO {

	public static void main(String[] args) {
		try (
			FileInputStream in = new FileInputStream("sapin.txt");
			FileOutputStream out = new FileOutputStream("sapout.txt");
		) {
			int c;
			while ((c=in.read()) != -1)
				out.write(c);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}

//byte stream --> ASCII
//Character stream --> Unicode

//serialization - saving the state of an object onto a file