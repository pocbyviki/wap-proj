package com.wap.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3-	Write a program to remove any special character from String, how many ways?
 * @author bhara
 *
 */
public class RemoveSpecialCharactor {

	public static void main(String[] args) {
		String str = "ashjkfk@43&*,ghj.uehd)df;fgdfgg";
		// 1st way
		str.replaceAll("[^a-z A-Z]", "");
		removeOnlySpecialChar(str);
		removeAllExceptNumber(str);
		remove‘nlyNumber(str);
		removeAllExceptSpecialChar(str);
	}
	
	private static void removeOnlySpecialChar(String str) {

		Pattern pattern = Pattern.compile("[^a-z A-Z 0-9]");
		Matcher matcher = pattern.matcher(str);
		String withoutSpecialChar = matcher.replaceAll("");
		System.out.println(withoutSpecialChar);
		System.out.println(str.replaceAll("[^a-z A-Z]", ""));
	}
	
	private static void removeAllExceptNumber(String str) {
		
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(str);
		String withoutSpecialChar = matcher.replaceAll("");
		System.out.println(withoutSpecialChar);
		
	}
	private static void remove‘nlyNumber(String str) {
		
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(str);
		String withoutSpecialChar = matcher.replaceAll("");
		System.out.println(withoutSpecialChar);
		
	}
	
	private static void removeAllExceptSpecialChar(String str) {
		Pattern pattern = Pattern.compile("[,./;:'|}{=+-_)(*&^%$#@!~`]");
		Matcher matcher = pattern.matcher(str);
		String withoutSpecialChar = matcher.replaceAll("");
		System.out.println(withoutSpecialChar);
	}
	
}
