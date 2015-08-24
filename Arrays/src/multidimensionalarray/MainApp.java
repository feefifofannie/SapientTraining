/**
 * 
 */
package multidimensionalarray;


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
		
		int[][][] num = new int[5][3][4];
		num[1][1][1] = 5;
		
		for (int[][] twod : num){
			for (int oned[] : twod){
				for (int val : oned){
					System.out.println(val);
				}
			}
		}
	
		
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