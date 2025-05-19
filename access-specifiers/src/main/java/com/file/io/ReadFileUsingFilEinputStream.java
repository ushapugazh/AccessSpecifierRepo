package com.file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFilEinputStream {
	public static void main(String[] args) throws IOException {
		
		  try {
			  FileInputStream fis = new FileInputStream(new File("File1.txt"));
			  while(fis.read() != -1)
			  {
				  System.out.println(fis.readAllBytes());
			  }
		  }
		  catch(IOException ex) {
			  
		  }
	}
}
