package com.java.reflection.api;

public class TestForClassLevelDetails {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();
		try {
			concreteClass = Class.forName("com.java.reflection.api.ConcreteClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(concreteClass.getCanonicalName()); 

		Class<?> superClass = Class.forName("com.java.reflection.api.ConcreteClass").getSuperclass();
		System.out.println("SuperCalss name is " + superClass); // prints "class com.journaldev.reflection.BaseClass"
		System.out.println(Object.class.getSuperclass()); // prints "null"
		System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"
	}

}
