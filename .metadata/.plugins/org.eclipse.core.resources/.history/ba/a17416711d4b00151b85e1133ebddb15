package com.sapient.keyvalues;

import java.util.Enumeration;
import java.util.Properties;

public class KeyValues {

	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		
		Enumeration keys = sysProp.keys();
		String key;
		
		while (keys.hasMoreElements()){
			key = (String) keys.nextElement();
			System.err.println(key+" : "+sysProp.getProperty(key));
		}
	}

}
