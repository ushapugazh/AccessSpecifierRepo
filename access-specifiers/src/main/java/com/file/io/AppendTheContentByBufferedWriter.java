package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTheContentByBufferedWriter {
	public static void main(String[] args) throws IOException 
	{
		File file = new File("AppendText.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(" Br data");

		br.close();
		fr.close();
	}
}
