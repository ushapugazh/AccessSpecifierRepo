package com.java.reflection.api;

import java.util.Arrays;

public class GetPublicMemberOfClass {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		Class<?> concreteClass = ConcreteClass.class;
		
		/*
		 * getClasses Returns an array containing Class objects representing all the public classes
		 * and interfaces that are members of the class represented by this Class object.
		 * This includes public class and interface members inherited from super classes
		 * and public class and interface members declared by the class
		 */
		Class<?>[] classes = concreteClass.getClasses();
		
		//System.out.println(Arrays.toString(classes));
		for(Class c : classes) {
			//System.out.println(c);
		}
		
		Class<?>[] explicitClasses = Class.forName("com.java.reflection.api.ConcreteClass").getDeclaredClasses();
		for(Class c1 : explicitClasses) {
			System.out.println(c1);
		}

	}

}
