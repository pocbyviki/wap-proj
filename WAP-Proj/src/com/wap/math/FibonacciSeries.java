package com.wap.math;

import java.util.Arrays;
import java.util.List;

/**
 * Ex- 0,1,1,2,3,5,8,13,21...etc
 * @author Vivek.Kumar
 *
 */
public class FibonacciSeries {

	
	public static void main(String[] args) {
		System.out.println(fibonacciSeries(15));
	}
	
	public static String fibonacciSeries(int num) {
		
		int[] feb = new int[num];
		feb[0] = 0;
		feb[1] = 1;
		
		for (int i = 2; i < num; i++) {
			feb[i] = feb[i-1] + feb[i-2];
		}
		
		
		
		return Arrays.toString(feb);
	}
}
