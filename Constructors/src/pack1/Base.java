package pack1;

public class Base {
	int data1;
	int data2;
	
	public Base(int value){
		data1 = value;
		System.out.println("Constructor");
	}
	
	public Base(int value1, int value2){
		data1 = value1;
		data2 = value2;
		System.out.println("Constructor");
	}
}
