package com.java.seven.features;

 interface A{
	static void m() {
		System.out.println("from A ");
	}
}

 interface B{
	static void m() {
		System.out.println("from B ");
	}
}

public class InterfaceStaticMethods implements A, B{

	void m() {
		System.out.println("from Child");
	}
	public static void main(String[] args) {
		A.m();
	}
}
