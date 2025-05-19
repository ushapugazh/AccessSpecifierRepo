package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fr = new FileWriter(new File("AppendText.txt"), true);
															try(fr) {
																fr.write(" Br data");
																//fr.close();
															}catch(Exception ex) {
																
															}
		


	}
}
