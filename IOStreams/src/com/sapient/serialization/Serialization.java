package com.sapient.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeAddress();
		readAddress();
	}
	
	/*
	 * serializes the object
	 */
	public static void writeSerializedObject() {
		try {
			SerializedObject object1 = new SerializedObject("Hi", -7, 2.7);
			System.out.println("object1: " + object1);
			FileOutputStream fos = new FileOutputStream("store");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}
		catch(IOException e){
			System.out.println("Exception : " + e);
			System.exit(0);
		}
	}
	
	/*
	 * de-serializes the object
	 */
	public static void readSerializedObject() {
		try{
			SerializedObject object2;
			FileInputStream fis = new FileInputStream("store");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (SerializedObject)ois.readObject();
			ois.close();
			System.out.println("object2: " + object2);
		}
		catch(Exception e){
			System.out.println("Exception : " + e);
			System.exit(0);
		}
	}
	
	
	public static void writeAddress() {
		Address address = new Address();
		address.setCountry("india");
		address.setStreet("Park Street");
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readAddress() {
		
		try {
			FileInputStream fout = new FileInputStream("D:\\address.ser");
			ObjectInputStream oos = new ObjectInputStream(fout);
			System.out.println(oos.readObject());
			oos.close();
			System.out.println("Done");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
