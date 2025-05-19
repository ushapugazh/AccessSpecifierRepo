package com.java.reflection.api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class InvokingPublicMethod {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, InvocationTargetException {
		Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class); //ms input are methodname and Object... type of input types to thsi method
		Map<String, String> hm = new HashMap<>();
		method.invoke(hm, "I Am Key", "I am Value");
		System.out.println(hm); // prints {key=value}
	}

}
