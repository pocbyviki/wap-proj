package com.wap.sorting;

import java.util.Arrays;

/**
 * 18-	Write a program to sort given array in ascending order without using Collection API/or any other 
 * Ex- {36,12,50,6,38,15,5}----> {5,6,12,15,36,38,50}
 * @author bhara
 *
 */
public class ArraySorting {

	public static void main(String[] args) {
		int[] numArr = {36,12,50,6,38,15,5};
		//1st way
		sortInASC(numArr);
		// 2nd way
		sortInDESC(numArr);
		
		sortUsingArrays(numArr);
		
		String[] strArr =  {"Vivek","Rajesh","Anjali","Priyanka","ANamika"};
		sortStringInDESC(strArr);
		sortStringInASC(strArr);
	}
	
	private static void sortInASC(int[] numArr ){
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=i+1; j<numArr.length; j++) {
				if (numArr[i] > numArr[j]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
	}
	
	private static void sortInDESC(int[] numArr){
		for(int i=0; i<numArr.length; i++) {
			for(int j=i+1; j<numArr.length; j++) {
				if (numArr[i] < numArr[j]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
	}

	private static void sortUsingArrays(int[] numArr){
		Arrays.sort(numArr);
		System.out.println("sorted by using Arrays.sort()");
		System.out.println(Arrays.toString(numArr));
	}
	
	private static void sortStringInDESC(String[] strArr){
		for(int i=0; i<strArr.length; i++) {
			for(int j=i+1; j<strArr.length; j++) {
				if (strArr[i].compareTo(strArr[j]) < 1) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(strArr));
	}

	private static void sortStringInASC(String[] strArr){
		for(int i=0; i<strArr.length; i++) {
			for(int j=i+1; j<strArr.length; j++) {
				if (strArr[i].compareTo(strArr[j]) > 1) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
	
}
