package staticexample;

class Data {
	static int value;
	
	/*static block*/
	static {
		value = 88;
		//used to access a static member in the class
		//executed the moment the class is loaded into the memory
		//cannot take parameters
	}
}

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data.value = 5893;  //can be accessed before any instance of that class is created
		
		Data data1 = new Data();
		Data data2 = new Data();
		
		data1.value = 4;
		data2.value = 8;
		
		Data.value = 5;
		
		System.out.println(data1.value+"    "+data2.value);
	}

}
