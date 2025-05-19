package com.custom.annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnoationUsage {
	@Override
	@MethodInfo(author = "Usha Pugazh", comments = "toString method", date = "May 13 2025", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "May 13 2025")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@MethodInfo(author = "Usha Pugazh", comments = "Main method", date = "May 13 2025", revision = 10)
	public static void genericsTest() throws Exception {
		List l = new ArrayList();
		l.add("abc");
		oldMethod();
	}

}
