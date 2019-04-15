package com.wap.math;

/**
 * 
 * @author bhara
 *
 */
public class SumOfAllIntegerOfNum {

	public static void main(String [] args) {
		
		int n=37;
		int sum = n*(n+1)/2;
		
		System.out.println("sum with formula:"+sum);
		System.out.println("sum with loop: "+sum(n));
	}
	
	private static int sum(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum = i+sum;
		}
		
		return sum;
	}
	
}
