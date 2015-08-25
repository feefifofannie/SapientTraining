package com.sapient.objectclass;

public class ObjectClass {
	public static void main(String[] args){
		Data d1 = new Data();
		Data d2 = new Data();
		Number n = new Number(6, 6);
		Object o = new Object();
		
		d1.setNumOne(6);
		d1.setNumTwo(6);
		d2.setNumOne(6);
		d2.setNumTwo(6);
		
		System.out.println(d1==d2);  		//false - uses address not values
		System.out.println(d1.equals(d2));  //true
		System.out.println(d1.equals(n));	//false - different types of objects
		System.out.println(d1.equals(o));   //false - different once casted
	}
}

class Number{
	int numOne;
	int numTwo;
	public Number (int value1, int value2){
		numOne = value1;
		numTwo = value2;
	}
}

class Data {
	private int numOne;
	private int numTwo;

	public int getNumOne() {
		return numOne;
	}

	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}

	public int getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	
	public boolean equals(Object o){
		if (o != null && o instanceof Data){
			Data temp = (Data)o;
			if (temp.getNumOne() == numOne){
				if (temp.getNumTwo() == numTwo){
					return true;
				}
			} 
		}
		return false;
	}
}