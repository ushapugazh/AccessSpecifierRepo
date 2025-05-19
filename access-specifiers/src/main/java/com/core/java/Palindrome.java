package com.core.java;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String reverse ="";
		for (int i =str.length()-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println(str.equals(reverse));
		
		
		String str1 ="";
		String str2=null;
		System.out.println(str1.isBlank() + " "  + str1.isEmpty() );
		System.out.println(str2.isBlank() + " "   );
		new StringBuffer("hello").reverse();
}
}
