package com.file.io;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileUsingDesktopCLass {

	public static void main(String[] args) throws IOException {
		 File file = new File("D:\\Java-Handson\\Hello.txt");
	        
	        //first check if Desktop is supported by Platform or not
	        if(!Desktop.isDesktopSupported()){
	            System.out.println("Desktop is not supported");
	            return;
	        }
	        
	        Desktop desktop = Desktop.getDesktop();
	        if(file.exists()) 
	        	desktop.open(file);
	        System.out.println("File Opened");


	}

}
