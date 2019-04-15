package com.wap.string;

/**
 * Q-	How to remove 1st and last character from String.how many ways to remove and which one is the best way to remove.?
 * Ans-
 * 1-by using str.subString(beginIndex,endIndex);
 * 2-by using StringBuilder deleteCharAt(index) method
 * 3-by using StringBuffer deleteCharAt(index) method
 *
 */
public class RemoveFirstAndLastCharactor {

	public static void main(String[] args) {
		String str = "ajhskhdkhfujkbdfjkjbkfbsdghkz";
		//1-way 
		System.out.println(str.substring(1, str.length()-1));
		//2nd way
		StringBuilder builder = new StringBuilder(str);
		builder.deleteCharAt(0);
		builder.deleteCharAt(builder.length()-1);
		System.out.println(builder);
		//3rd way
		StringBuffer buffer = new StringBuffer(str);
		buffer.deleteCharAt(0);
		buffer.deleteCharAt(buffer.length()-1);
		System.out.println(buffer);
		
	}
}
