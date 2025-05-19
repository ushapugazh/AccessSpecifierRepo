package com.file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) throws IOException {
	
		  try {
			   Scanner scanner = new Scanner(new File("File1.txt"));
				/*
				 * while (scanner.hasNextLine()) { System.out.println(scanner.nextLine()); }
				 */
			Scanner    scanner1 = new Scanner(new File("FilesNIO2.txt"));
			
			//without
			String con = scanner1.next();
			 System.out.println("Without Delimiter");
			   System.out.println(con);
			
			//With Delimiter
			   String con1 = scanner1.useDelimiter("/n").next();
			   System.out.println("With Delimiter");
			   System.out.println(con1);
			   
			  } catch (FileNotFoundException e) {
			   e.printStackTrace();
			  }
			 }

}
