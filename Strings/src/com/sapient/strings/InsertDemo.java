package com.sapient.strings;

class InsertDemo {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("I Java!");

		sb.insert(2, "like ");
		System.out.println(sb);
	}
}