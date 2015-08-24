/**
 * 
 */
package referencearray;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author dredmo
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point[] arr = createArray();
		for(int counter=0; counter<10; counter++){
			System.out.println(arr[counter].toString());
		}

		Calendar c = new GregorianCalendar();
		System.out.println(c.getTime());
		
	}
	public static Point[] createArray(){
		Point[] p = new Point[10];
		for (int count=0; count<10; count++){
			p[count] = new Point(count, count+1);
		}
		return p;
	}

}

class Point{
	int x, y;
	
	public Point(int one, int two){
		x = one;
		y = two;
	}
	
	public String toString(){
		return new String("("+x+", "+y+")");
	}
}