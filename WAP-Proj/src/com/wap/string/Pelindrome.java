package com.wap.string;
/**
 * Q-write a program to check Pelindrom
 * @author bhara
 *
 */
public class Pelindrome {

	public static void main(String[] args) {
	String str = "abba";	
	System.out.println(isPalindrome(str));
	}
	
	private static boolean isPalindrome(String text) {
	    String clean = text.toLowerCase();
	    int length = clean.length();
	    int forward = 0;
	    int backward = length - 1;
	    while (backward > forward) {
	        char forwardChar = clean.charAt(forward++);
	        char backwardChar = clean.charAt(backward--);
	        if (forwardChar != backwardChar)
	            return false;
	    }
	    return true;
	}
	
	
}
