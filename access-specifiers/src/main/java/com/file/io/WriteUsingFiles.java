package com.file.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteUsingFiles {

	public static void main(String[] args) {
        String data = "I will write this String to File in Java";   
        writeUsingFiles(data);   
        
    }
	
	// Use Files class from Java 1.7 to write files, internally uses OutputStream
	 private static void writeUsingFiles(String data) {
	        try {
	            Files.write(Paths.get("FilesNIO.txt"), data.getBytes());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
