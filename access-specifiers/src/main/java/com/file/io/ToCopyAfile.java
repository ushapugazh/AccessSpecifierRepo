package com.file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.apache.commons.io.FileUtils;

public class ToCopyAfile {

	//Using Apache common IO Utils
	private static void copyFileUsingApacheCommon(File source, File dest) throws IOException {
	    FileUtils.copyFile(source,dest);
	}
	//Using java.nio.channels.FileChannel 
	private static void copyFileUsingChannel(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        sourceChannel = new FileInputStream(source).getChannel();
	        destChannel = new FileOutputStream(dest).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
	
	
	public static void main(String[] args) throws IOException {
		 String fileSeparator = System.getProperty("file.separator");
		// File sourcefile = new File("D:"+sepatator+"Java-Handson"+sepatator+"Source.txt");
		// File destFile =   new File("D:"+sepatator+"Java-Handson"+sepatator+"Destination.txt");
		 
		 
		 String absoluteFilePath = "C:"+fileSeparator+"users"+fileSeparator+"Dell - Laptop"+fileSeparator+
				 "FilesHandsOn"+fileSeparator;
		 File sourcefile= new File(absoluteFilePath+"source.txt"); 
		 File destFile  = new File(absoluteFilePath+"destination.txt");  
		 copyFileUsingApacheCommon(sourcefile,destFile);
		 System.out.println("Successfully Copied a file");
		// copyFileUsingChannel(sourcefile,destFile);
	}
	
	
}
