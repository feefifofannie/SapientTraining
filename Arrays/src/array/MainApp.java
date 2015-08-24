/**
 * 
 */
package array;

/**
 * @author dredmo
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
	
		Process p = new Process();
		int[] result = p.create();
		p.display(result);
	}

}

class Process{
	public int[] create(){
		int num[];
		num = new int[10];
		num[3] = 6;
		num[7] = 9;
		
		return num;
	}
	
	public void display(int[] src){
		for(int counter=0; counter<10; counter++){
			System.out.println(src[counter]);
		}
	}
}
