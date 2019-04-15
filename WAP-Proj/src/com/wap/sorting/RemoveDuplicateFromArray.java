package com.wap.sorting;

/**
 * 
 * @author bhara
 *
 */
public class RemoveDuplicateFromArray {

	
	
	public static void main(String[] args) {
		int[] numArr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		remove(numArr);
	}
	
	private static void remove(int[] numArr){
		
		int[] temp = new int[numArr.length];
		int j=0;
		for(int i=0; i<numArr.length-1; i++){
			if (numArr[i] != numArr[i+1]) {
				temp[j++] = numArr[i];
			}
		}
		temp[j++] = numArr[numArr.length-1];
		
		for(int i=0; i<j; i++){
			System.out.print(temp[i]+" ");
		}
	}
}
