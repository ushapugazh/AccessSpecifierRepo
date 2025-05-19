package com.java.reflection.api;

import java.lang.reflect.Type;

public class GetImplementedInterfaces {

	public static void main(String[] args) throws Exception {
		Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
		for(Type t : interfaces) {
			System.out.println(t);
		}

	}

}
