package com.java.reflection.api;

import java.lang.reflect.Modifier;

public class GettingClassModifiers {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> concreteClass = ConcreteClass.class;
		System.out.println(Modifier.toString(concreteClass.getModifiers())); // prints "public"
		// prints "public abstract interface"
		System.out.println(Modifier.toString(Class.forName("com.java.reflection.api.BaseInterface").getModifiers()));
	}
}
