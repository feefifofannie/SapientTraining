package enumeratedtype;

enum Apple {
	Jonathon, GoldenDel, RedDel, WineSap, Cortland
}

/**
 * Enum class with variables attached
 */
enum ApplesAndPrices {
	Jonathon(10), GoldenDel(9), RedDel(12), WineSap(15), Cortland(8), GrannySmith(14), Fuji(20);
	
	private int price;
	
	//Constructor
	ApplesAndPrices(int p) {
		price = p;
	}
	int getPrice(){
		return price;
	}
}


public class EnumDemo {

	public static void main(String[] args) {
		Apple ap;
		System.out.println("Here are all apple constants");
		
		Apple allApples[] = Apple.values();
		for (Apple a : allApples){
			System.out.println(a);
		}
		
		ap = Apple.valueOf("WineSap");
		System.out.println("ap contains "+ap);
		
		System.out.println();
		System.out.println("All apple prices:");
		ApplesAndPrices a_p[] = ApplesAndPrices.values();
		for (ApplesAndPrices a : a_p){
			System.out.println(a + " costs "+ a.getPrice() + " cents.");
		}
	}

}
