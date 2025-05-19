package com.java.reflection.api;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GetAllPublicMethods {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		Method[] publicMethods = Class.forName("com.java.reflection.api.ConcreteClass").getMethods();
		
		for (Method m :publicMethods ) {
			System.out.println(m);
		}

	}

}
