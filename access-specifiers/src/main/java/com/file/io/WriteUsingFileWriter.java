package com.file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {

	
	private static void writeUsingFileWriter(String data) {
        File file = new File("FilesNIO.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	public static void main(String[] args) {
        String data = "Through FileWriter I will write this String to File in Java";   
        writeUsingFileWriter(data);   
        
    }
	
}
