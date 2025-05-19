package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendTheContentByPrintWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("AppendText.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		PrintWriter pr = new PrintWriter(br);
		pr.println(" Pw data");
		pr.close();
		br.close();
		fr.close();
	}
}
