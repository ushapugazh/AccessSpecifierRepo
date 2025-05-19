package com.java.reflection.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GetAllPublicConstructors {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		//Get All public constructors
		Constructor<?>[] publicConstructors = Class.forName("com.java.reflection.api.ConcreteClass").getConstructors();
		for (Constructor con :publicConstructors ) {
			System.out.println(con);
		}
	}

}
