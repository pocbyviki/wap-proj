package com.wap.array;
/**
 * FAQ- how to find product of an array's element?
 * @author vivek.kumar
 *
 */
public class CalculateProductOfArrayElement {

	
	public static void main(String[] args) {
		int[] numArr = {1,2,3,4};
		System.out.println(calcProduct(numArr));
	}
	
	private static  int calcProduct(int[] numArr){
		int next = 0;
		int product = 1;
		for(int i=0; i<numArr.length; i++){
			if (i >0) {
				next = numArr[i];
				product = product * next;
			}
			
		}
		return product;
	}
}
