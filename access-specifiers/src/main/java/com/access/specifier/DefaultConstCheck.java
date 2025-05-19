package com.access.specifier;

public class DefaultConstCheck {

	int i;
	static int abc;
	
	  DefaultConstCheck() {
		  System.out.println("default");
	}
	  DefaultConstCheck(int i) {
		  this.i=i;
		  System.out.println("para");
	}
	public static void main(String[] args) {
		
		DefaultConstCheck a = new DefaultConstCheck(10);
		
	}

}
