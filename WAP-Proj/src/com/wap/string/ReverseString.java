package com.wap.string;

/**
 * 12-	Write Java program to reverse String in Java without using API functions ?
 * Ex- ABCD---> DCBA
 * @author bhara
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String input = "ABCD";
		//1st way
		reverseByStringBuilder(input);
		//2nd way
		reverseByUsingCharArray(input);
		//3rd way
		reverseByUsingByteArray(input);
	}
	
	private static void reverseByStringBuilder(String str) {
		StringBuilder builder = new StringBuilder(str);
		String reverse = builder.reverse().toString();
		System.out.println("by using StringBuilder reverse() method:");
		System.out.println(reverse);
	}
	
	private static void reverseByUsingCharArray(String str) {
		char[] charArr = str.toCharArray();
		System.out.println("By using String's char[] toCharArray()");
		for(int i=0; i<charArr.length; i++) {
			System.out.print(charArr[charArr.length-i-1]);
		}
		System.out.println();
	}
	
	private static void reverseByUsingByteArray(String str){
		byte[] byteArray = str.getBytes();
		byte[] toArray = new byte[str.length()];
		for(int i=0; i<byteArray.length; i++) {
			toArray[i]=byteArray[byteArray.length-i-1];
		}
		
		String reverse = new String(toArray);
		System.out.println("By using String's byte[] getBytes()");
		System.out.println(reverse);
	}
}
