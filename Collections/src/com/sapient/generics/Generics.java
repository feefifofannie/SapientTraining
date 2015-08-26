package com.sapient.generics;

public class Generics {

	public static void main(String[] args) {
		Data<Integer> i = new Data<Integer>();
		Data<Double> d = new Data<Double>();
		d.setValue(34.5);
		i.setValue(7);
		System.out.println(d.getValue());
	}

}

/*
 * T used as placeholder for all data types, doesn't allow primitive types
 * E would be for element (data structures)
 * K, V for key value pairs
 */
class Data<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
