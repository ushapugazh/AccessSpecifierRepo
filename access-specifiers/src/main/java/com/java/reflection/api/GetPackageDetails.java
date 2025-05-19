package com.java.reflection.api;

public class GetPackageDetails {

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println(Class.forName("com.java.reflection.api.BaseInterface").getPackage().getName());

	}

}
