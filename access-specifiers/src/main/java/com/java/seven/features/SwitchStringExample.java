package com.java.seven.features;

public class SwitchStringExample {
	public static void main(String[] args) {
		printColorUsingSwitch("red");
		// switch case string is case sensitive
		printColorUsingSwitch("RED");
		printColorUsingSwitch(null);
	}

	

	private static void printColorUsingSwitch(String color) {
		switch (color) {
		case "blue":
			System.out.println("BLUE");
			break;
		case "red":
			System.out.println("RED");
			break;
		default:
			System.out.println("INVALID COLOR CODE");
		}
	}

}