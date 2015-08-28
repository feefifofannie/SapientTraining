package com.sapient.serialization;

import java.io.Serializable;

/*
 * serialization - saving the state of an object onto a file
 * Any object that you want to serialize must implement serializable
 */
class SerializedObject implements Serializable{
	String s;
	int i;
	double d;
	public SerializedObject(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	public String toString() {
		return "s= " + s  + "; i= " + i + "; d= " + d;
	}
}