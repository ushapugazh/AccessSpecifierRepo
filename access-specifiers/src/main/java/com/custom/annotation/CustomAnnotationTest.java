package com.custom.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CustomAnnotationTest {

	public static void main(String[] args) {
		try {
			for (Method method : CustomAnnotationTest.class.getClassLoader().loadClass(("com.custom.annotation.AnnoationUsage")).getMethods()) {
				// checks if MethodInfo annotation is present for the method
				if (method.isAnnotationPresent(MethodInfo.class)) {
					try {
						// iterates all the annotations available in the method
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method '" + method + "' : " + anno);
						}
						MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
//*****************************************************ms here @'s revision fld which is having revision fld value as 1 is checked and processed
						if (methodAnno.revision() == 1) {
							System.out.println("Method with revision no 1 = " + method);
						}

					} catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	
}
