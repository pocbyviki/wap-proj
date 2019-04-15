package com.wap.math;

/**
 *Question-->	1-Write a Java program to find if a number is prime number or not
 *	2- write a program to print all prime number between 1 to 100.
 * Definition: Prime number is a number that is greater than 1 and divided by 1 and itself only.
 * Ex- 1,2,3,5,7,11,13,17 etc
 * @author bhara
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int num =15;
		//1- find given value is prime?
		System.out.println("num="+num+" is prime no? : "+isPrime(num));
		//2- print all prime no between 1 to 100
		printAllPrimeNo(num);
	}
	
	 // function check whether a number 
    // is prime or not
    static boolean isPrime(int num)
    {
        // if num is zero or negative 
        if (num <= 0) {
        	return false;
        }
      
        // Check from 1 to n-1
        for (int i = 2; i < num; i++) {
        	if (num % i == 0) {
                return false;
        	}   
        }
            
        return true;
    }
    
    public static void printAllPrimeNo(int num) {
    	
    	for(int i=1; i<=num; i++) {
    		if (isPrime(i)) {
    			System.out.print(i+" ");	
    		}
    	}
    	
    }
}
