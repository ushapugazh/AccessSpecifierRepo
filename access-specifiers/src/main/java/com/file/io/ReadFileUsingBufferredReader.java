package com.file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferredReader {

	public static void main(String[] args) throws IOException {
		 String fileSeparator = System.getProperty("file.separator");
		 String absoluteFilePath = "C:"+fileSeparator+"users"+fileSeparator+"Dell - Laptop"+fileSeparator+
				 "FilesHandsOn"+fileSeparator;
		 File sourcefile= new File(absoluteFilePath+"source.txt"); 
		BufferedReader br = new BufferedReader(new FileReader(sourcefile));
		/*
		 * while(br.readLine() != null) { System.out.println(br.readLine()); }
		 */
			//2nd way
			 String line = br.readLine();
			   while (line != null) 
			   {
			    System.out.println(line);
			    line = br.readLine();
			   }

	}
	}

