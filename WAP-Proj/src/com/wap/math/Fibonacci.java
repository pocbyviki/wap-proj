package com.wap.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 9-	Write a Java program to print Fibonacci series up to 100?
 * Ex- 0,1,1,2,3,5,8,13,21,34,55,89,144......etc
 * logic: lets assume
 * 
 * 
 * @author bhara
 *
 */
public class Fibonacci {
public static void main(String[] args) {
	int num = 100;
	fibonacci(num);
}

private static void fibonacci(int num) {
	int temp=0;
	int first=0;
	int next=1;
	int i;
	//List<Integer> list = new ArrayList<>();
	for(i=0; i<num; i++) {
		System.out.print(first+" ");
		//list.add(first);
		temp = first+next;
		first=next;
		next=temp;
		//i=temp;
		
	}
	
}


}
