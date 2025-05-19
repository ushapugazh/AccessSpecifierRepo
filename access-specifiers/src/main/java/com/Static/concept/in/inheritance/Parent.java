package com.Static.concept.in.inheritance;

import java.util.Arrays;

class Parent1 {

	 Parent1(){	 System.out.println("Parent");	 }
	 static int  i=15;
	
	static int m() {
		return i;
	}
	
}


class Child extends Parent1 
{
	static int abc =12;
	int m;
	Child(){ System.out.println("child"); }
	
	Child(int k){ 
		k =this.m;
		System.out.println("child parameterised : " + k); }
	
int	n(){
		
	return m();
	}
	
int k() {
	return i+10;
}
}

class Parent{
	public static  void main(String[] args) {
		System.out.println("Testing Teh child" +Child.m());
		/*
		 * Child c = new Child() ; System.out.println(c.k()); System.out.println(c.n());
		 */
		Child c1 = new Child(20) ;
		System.out.println(c1.k());
		System.out.println(c1.n());
			
		}
	public void abcd(final int a) {
		Integer[] a1 = {1,2,3,4,5};
		Arrays.asList(a1).stream();
		 return;
	}
	
	}
