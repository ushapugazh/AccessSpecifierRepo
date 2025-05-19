package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
	public static void main(String[] args) {
        String data = "Through BR I will write this String to File in Java";   
        int noOfLines = 10000;
        writeUsingBufferedWriter(data, noOfLines);   
    }
	
	private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("FilesNIO.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
