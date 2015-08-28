package com.sapient.channels;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class ChannelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void explicitChannelRead() {
		 FileInputStream fIn; 
		    FileChannel fChan; 
		    long fSize; 
		    ByteBuffer mBuf; 
		 
		    try { 
		      // First, open an file for input. 
		      fIn = new FileInputStream("test.txt"); 
		 
		      // Next, obtain a channel to that file. 
		      fChan = fIn.getChannel();
		 
		      // Now, get the file's size. 
		      fSize = fChan.size();
		 
		      // Allocate a buffer of the necessary size. 
		      mBuf = ByteBuffer.allocate((int)fSize); 
		 
		      // Read the file into the buffer. 
		      fChan.read(mBuf);
		       
		      // Rewind the buffer so that it can be read. 
		      mBuf.rewind(); 
		 
		      // Read bytes from the buffer. 
		      for(int i=0; i < fSize; i++) 
		        System.out.print((char)mBuf.get());
		 
		      System.out.println(); 
		 
		      fChan.close(); // close channel 
		      fIn.close();   // close file 
		    } catch (IOException exc) { 
		      System.out.println(exc); 
		      System.exit(1); 
		    } 
	}

}
