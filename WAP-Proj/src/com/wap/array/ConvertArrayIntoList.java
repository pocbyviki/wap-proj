package com.wap.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayIntoList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list);
		// how to convert int[] to List<Integer>
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> lt=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	}

}
