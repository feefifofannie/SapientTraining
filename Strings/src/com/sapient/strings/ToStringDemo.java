package com.sapient.strings;

class ToStringDemo {
	public static void main(String args[]) {
		Box b = new Box(10, 12, 14);
		String s = "Box b: " + b; // concatenate Box object

		System.out.println(b); // convert Box to string
		System.out.println(s);
	}
}