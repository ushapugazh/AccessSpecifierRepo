package com.core.java;

public class PalindromeWIthSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="madam1";
		boolean isPalindrome =false;
		for(int i=0; i<str.length();i++)
		{
			//System.out.println(str.substring(0, i));
			//System.out.println(str.substring(str.length()-i));
			String toBeReversed =str.substring(str.length()-i);
			String reversed = "";
			
			System.out.println("to be reversed is " + toBeReversed);
			for(int j=toBeReversed.length()-1; j>=0 ;j--)
			{
				reversed = reversed + toBeReversed.charAt(j);
				System.out.println("reveresd is : " + reversed);
			}
			isPalindrome	= str.substring(0, i).equals(reversed);
		}
		
		System.out.println(isPalindrome);
	}

	}


