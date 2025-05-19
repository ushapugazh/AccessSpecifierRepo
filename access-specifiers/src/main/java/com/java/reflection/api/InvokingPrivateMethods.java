package com.java.reflection.api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokingPrivateMethods {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, InvocationTargetException {
		Method method = Class.forName("com.java.reflection.api.BaseClass").getDeclaredMethod("method3", null);
		method.setAccessible(true);
		method.invoke(null, null); //prints "Method3"

	}

}
