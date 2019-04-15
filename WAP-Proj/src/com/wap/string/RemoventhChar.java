package com.wap.string;

import java.util.Scanner;

/**
 * 2-	Write a program to remove nth character from String?
 * @author bhara
 *
 */
public class RemoventhChar {

	public static void main(String[] args) {
		System.out.println("which position of String you want to remove?");
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();
		String str = "ABCDEFGH";
		StringBuilder builder = new StringBuilder(str);
		builder.deleteCharAt(position-1);
		
		System.out.println(builder);
	}
	
	private static void deleteEvery3rdChar() {
		String str = "I LOVE STACKOVERFLOW";
		StringBuilder builder = new StringBuilder(str);
		for(int i =0; i<str.length(); i++) {
			
		}
		
	}
}
