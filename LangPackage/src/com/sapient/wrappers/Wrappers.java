package com.sapient.wrappers;

public class Wrappers {

	public static void main(String[] args) {
		Wrappers w = new Wrappers();
		w.manualBoxing();
		w.autoBoxing();
		w.bitwiseOperators();
	}
	
	/*
	 * Integer is wrapper class for int
	 */
	public void manualBoxing(){
		int pInt = 420;
		Integer wInt = new Integer(pInt);  //boxing
		int p2 = wInt.intValue();   	   //unboxing
		
		//examples
		String str = "69";
		int x = Integer.valueOf(str).intValue();
		x = Integer.parseInt(str);
		System.out.println(x);
		str = Integer.toBinaryString(x);
		System.out.println(str);
		
	}
	
	/*
	 * Recommended not to use autoboxing as there is performance loss
	 * Okay to use indirectly (in Collections)
	 */
	public void autoBoxing(){
		int pInt = 420;
		Integer wInt = pInt;		//autoboxing
		int p2 = wInt;				//auto-unboxing
	}
	
	/*
	 * Use on simple processors for fast computation
	 * Will likely never use in enterprise appplications
	 */
	public void bitwiseOperators() {
		int a = 60;	/* 60 = 0011 1100 */  
	     int b = 13;	/* 13 = 0000 1101 */
	     int c = 0;

	     c = a & b;       /* 12 = 0000 1100 */ 
	     System.out.println("a & b = " + c );

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );

	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );

	     c = a >> 2;     /* 215 = 1111 */
	     System.out.println("a >> 2  = " + c );

	     c = a >>> 2;     /* 215 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
	}

}
