package com.wap.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Prime Number means a number which is only divided by 1 and itself 
 * but not any other number
 * EX- 1,2,3,5,7 etc
 * @author Vivek.Kumar
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Prime Numbers in 1 to 100 :"+primeNumbersIn(100));
	}
	
	private static List<String> primeNumbersIn(int num) {
		List<String> primeNumList = new ArrayList<>();
		for (int i = 1; i < num; i++) {
			if(isPrime(i)) {
				primeNumList.add(Integer.toString(i));
			}
		}
		return primeNumList;
	}
	
	private static boolean isPrime(int num) {
		
		for (int f = 2; f < num; f++) {
			if (isOdd(f, num)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isOdd(int factor, int num) {
		
		return num % factor == 0;
	}
}
