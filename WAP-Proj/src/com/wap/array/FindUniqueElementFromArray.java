package com.wap.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueElementFromArray {

	public static void main(String[] args) {

		int[] arr = {1,1,1,1,1,1,1,0,1,1,1,1,1,1};
		System.out.println(findByLoop(arr));
		findByCollection(arr);
	}
	
	public static int findByCollection(int[] arr){
		//how to convert int[] to List<Integer>/Set<Integer>
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
//		Set<Integer> set= new HashSet<>();
		System.out.println(set);
		return 0;
	}
	
	
	public static int findByLoop(int[] arr){
		
		int temp=0;
		int val =0;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if (count == 0) {
				temp = arr[i];
				count++;
			} else{
				if(temp == arr[i]){
					temp = arr[i];
				} else {
					val= arr[i];
				}
			}
			
		}
		return val;
	}
	
}
