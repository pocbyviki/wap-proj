package com.wap.math;
/**
 * 16-	Write a program to sum of digits
 * Ex- if num is 212 then sum = 2+1+2=5
 * @author bhara
 *
 */
public class SumOfDigits {

	public static void main(String[] args) {
		int num = 212;
		//1st way
		sumOfDigits(num);
		//2nd way
		sum(num);
	}
	
	private static void sumOfDigits(int num) {
		
		int temp =num;
		int remainder = 0;
		int sum =0;
		while(temp >0) {
			remainder = temp % 10;
			sum = sum+remainder;
			temp = temp / 10;
		}
		System.out.println("sum of digits("+num+")="+sum);
	}
	
	private static void sum(int num) {
		String str = Integer.toString(num);
		int sum = 0;
		String[] strArr = str.split("");
		for(int i=0; i<strArr.length; i++) {
			sum = sum + Integer.parseInt(strArr[i]) ;
		} 
		
		System.out.println(sum);
		
	}
	
}
