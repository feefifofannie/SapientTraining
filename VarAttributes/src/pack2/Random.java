package pack2;
import pack1.Math;

public class Random extends Math{
	//protected variables can be accessed by subcalsses even if they are not in the same package
	public void test3(){
		prof = "Protected";
		pubf = "Public";
	}
}
