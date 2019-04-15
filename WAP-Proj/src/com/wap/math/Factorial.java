package com.wap.math;

import java.util.Scanner;

/**
 * 8-	Write a program to calculate factorial of number (5!)?
 * @author bhara
 *
 * n!=n(n-1)(n-2)(n-3)-----(n-(n-1))
 * 5!=5(5-1)(5-2)(5-3)(5-4)=5*4*3*2*1
 * 
 */
public class Factorial {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		int val = 5;
		//1- by using loop
		factorialByLoop(val);
		//2- by using recursion method
		System.out.println(factorialByRecursion(val));
		//3- by using while loop
		System.out.println("by while loop="+factorialByWhileLoop(val));
		//4- by using do-while loop
		System.out.println(factorialByDoWhileLoop(val));
	}
	
	private static void factorialByLoop(int val) {
		// 1st way- 1*2*3*4*5
		int fact =1;
		for(int i=1; i<=val; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
		// 2nd way--> 5*4*3*2*1
		int facto = 1;
		for(int i=val; i>=1; i--) {
			facto = facto*i;
		}
		System.out.println(facto);
		
	}
	
	private static int factorialByRecursion(int val){
		
		if(val == 0) {
			return 1;
		}
		
		return  val*factorialByRecursion(val-1);
	}
	
	private static int factorialByWhileLoop(int val){
		int fact =1;
		int i =val;
		/*while(i>0 && i<=val) {
			fact = fact*i;
			i--;
		}*/
		while(true) {
			if (i == 0) {
				break;
			}
			fact=fact*i;
			i--;
		}
		return fact;
	}
	
	private static int factorialByDoWhileLoop(int val){
		
		int fact =1;
		int i=1;
		do {
			fact = fact*i;
			i++;
		} while(i<=val);
		
		return fact;
	}
}
