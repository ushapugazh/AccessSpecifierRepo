package com.file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTheContentByFileWriter {
	public static void main(String[] args) throws IOException 
	{
		//so here t
		  File file = new File("AppendText.txt");
		FileWriter fw = new FileWriter(file,true);
		fw.write("This is teh additional rtest");
		fw.close();
	}
}
	
