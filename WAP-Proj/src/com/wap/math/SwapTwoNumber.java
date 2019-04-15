package com.wap.math;

/**
 * 14-	How to Swap two numbers without using third variable in Java?
 * @author bhara
 *
 */
public class SwapTwoNumber {
public static void main(String[] args) {
	int x=10;
	int y=20;
	System.out.println("before swap x="+x+" y="+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swap x="+x+"  y="+y);
	
	
}
}
