package com.wap.math;

/**
 * this class will calculate the factorial value of any number
 * In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
 *  For example,
 *  5! = 5 * 4 * 3 * 2 * 1 = 120
 *  The value of 0! is 1
 * @author Vivek.Kumar
 *
 */
public class FactorialCalculation {

	public static void main(String[] args) {
		
		System.out.println("factorialByLoop :"+factorialByLoop(100));
		System.out.println("factorialByRecursion :"+factorialByRecursion(500));
	}
	
	private static long factorialByLoop(long n) {
		
		long factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	private static long factorialByRecursion(long n) {
		
		if (n == 0) {
			return 1;
		} else {
			return n * factorialByRecursion(n-1);
		}
	}
}
