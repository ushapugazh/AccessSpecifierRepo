package com.file.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		String fileSeparator = System.getProperty("file.separator");//while Debugging this was /
		String pathSeparator  = System.getProperty("file.pathSeparator");//while Debugging this was null
		
		//1. Using File
		 String absoluteFilePath = "C:"+fileSeparator+"users"+fileSeparator+"Dell - Laptop"+fileSeparator+
				 "FilesHandsOn"+fileSeparator+"file.txt";
	        File file = new File(absoluteFilePath);
	        System.out.println("pathSeparator" +file.pathSeparator);
	        System.out.println("separator" +file.separator);
	       
	        
	        //below all 3 gave absolute path only 
	    	System.out.println(file.getPath());  
			System.out.println(file.getAbsolutePath()); 
			System.out.println(file.getCanonicalPath());
	        try {
				if(file.createNewFile()){
				    System.out.println(absoluteFilePath+" File Created");
				}else System.out.println("File "+absoluteFilePath+" already exists");
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	   
	        
	        //2. using FileOutputStream
	        String fileData = "Hello usha Welcome";
	        FileOutputStream fos = new FileOutputStream("File1.txt");
	        fos.write(fileData.getBytes());
	        fos.flush();
	        fos.close();
	        
	        
	        //3. Using NIO
	        String msg = "Usha Welcome";
	        Files.write(Paths.get("Welcome.txt"), msg.getBytes());
	        
	      
	        //4. using Files from NIO
	        Path pathforFile = Paths.get("FilesNIO2.txt");
	        Path createdPath= Files.createFile(pathforFile);
	        System.out.println(createdPath);
	        
	        
	        
	        //to create a diRectory Using Files from NIO and few of its methods
	        Path pathforDirectory = Paths.get("D:"+fileSeparator+"Java-Handson"+fileSeparator +"mkdir");
	        Path createdDirectoryPath= Files.createFile(pathforDirectory);
	        System.out.println(createdDirectoryPath);
	        
	        
	   
	        
	        
	}			

}