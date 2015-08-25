package com.sapient.fileread;

import java.io.File;
import java.io.FileReader;

public class FileDemo {

	static void p(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		FileDemo d = new FileDemo();
		d.testTwo();
	}
	
	public void testOne(){
		File f1 = new File("D:/sapin.txt");
		p("File name: "+ f1.getName());
		p("Path: "+f1.getPath());
		p("Abs path: "+f1.getAbsolutePath());
		p("Parent :"+f1.getParent());
		p(f1.exists() ? "exists" : "does not exist");
		p(f1.canWrite() ? "can read" : "can not write");
		p(f1.canRead()  ? "can write" : "can not read");
		p("is" + (f1.isDirectory() ? "" : " not" + " a directory"));
		p(f1.isFile() ? "is normal file" : "might be a named pipe");
		p(f1.isAbsolute() ? "is absolute" : "is not absolute");
		p("File last modified: "+ f1.lastModified());
		p("File size: "+f1.length()+" bytes");
	}
	
	public void testTwo() {
		String dirName = "D:/sapient";
		File f1 = new File(dirName);
		
		if (f1.isDirectory()){
			System.out.println("Directory of "+ dirName);
			String s[] = f1.list();
			
			for (int i=0; i<s.length; i++) {
				File f = new File(dirName + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " is a directory");
				} else {
					System.out.println(s[i] + " is a file");
				}
			}
		} else {
			System.out.println(dirName + " is not a directory");
		}
	}

}
