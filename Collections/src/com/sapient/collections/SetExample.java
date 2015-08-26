package com.sapient.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetExample {

	public static void main(String[] args) {
		Set<Data> result = new HashSet<Data>();
		
		result.add(new Data(4));
		result.add(new Data(3));
		result.add(new Data(2));
		result.add(new Data(4));
		result.add(new Data(6));
		
		Iterator<Data> iterator = result.iterator();
		Data name;
		while (iterator.hasNext()){	
			name = iterator.next();
			System.out.println(name);
		}
		
	}

}

class Data {
	int value;

	public Data(int v) {
		value = v;
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return String.valueOf(value);
	}
	
	public boolean equals(Object o){
		if (o != null && o instanceof Data){
			Data temp = (Data)o;
			if (temp.getValue() == value){
					return true;
			} 
		}
		return false;
	}
}
