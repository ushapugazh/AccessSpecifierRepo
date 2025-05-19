package com.core.java;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RunTimeClass {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getFileSystem(URI.create("jrt:/"));
		System.out.println(fs);
		Path objClassFilePath = fs.getPath("modules", "java.base", "java/lang/Object.class");
		System.out.println(objClassFilePath);

	}

}
