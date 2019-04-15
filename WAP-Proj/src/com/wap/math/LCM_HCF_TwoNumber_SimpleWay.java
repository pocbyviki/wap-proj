package com.wap.math;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * by using while loop and below method in very less code we get job done.
 * but there is performance drawback of this method,if any number is bigger value
 * then while loop will loop through very long and response time will be decreased.
 * @author bhara
 *
 */
public class LCM_HCF_TwoNumber_SimpleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HCF="+hcf(10, 15));
		System.out.println("LCM="+lcm(1, 75));
		//if numbers are more than two
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(25);
		list.add(5);
		list.add(800000000);
		list.add(45);
		list.add(15);
		System.out.println("Start at "+LocalDateTime.now());
		//System.out.println("HCF="+hcf(list));
		int arr[] = { 10, 25, 5, 800000000, 45,15 }; 
		int n = arr.length; 
		System.out.println(findGCD(arr, n)); 
		System.out.println("End at "+LocalDateTime.now());
	}
	
	/**
	 * HCF means: Highest Common Factor of two or more Number,which can divide both the number:
	 * EX- assume we have to find HCF of [10,15] then the HCF would be highest common factor which
	 * should completely divide both the numbers [10,15] means the common factor would be less than or equal to max[10,15]
	 * so assume 15 would be HCF of [10,15] then we will iterate inside while loop and will check which value exactly divide
	 * 
	 * @param val1
	 * @param val2
	 * @return hcf
	 */
	public static int hcf(int val1,int val2) {
		if (val1 == 0 || val2 == 0) {
			throw new IllegalArgumentException("Number must be positive non-zero integer,but found:["+val1+","+val2+"]");
		}
		int hcf = val1>val2 ? val1 : val2;
		while(true) {
			if (val1 % hcf == 0 && val2 % hcf == 0) {
				return hcf;
			}
			hcf--;
		}
		
	}
	
	public static int lcm(int val1,int val2) {
		if (val1 == 0 || val2 == 0) {
			throw new IllegalArgumentException("Number must be positive non-zero integer,but found:["+val1+","+val2+"]");
		}
		int lcm = val1>val2 ? val1 : val2;
		while(true){
			if (lcm % val1 == 0 && lcm % val2 == 0) {
				return lcm;
			}
			lcm++;
		}
		
	}
	/**
	 * find HCF of more than two numbers
	 * @param numList
	 * @return
	 */
	public static int hcf(List<Integer> numList) {
		int hcf = max(numList);
		int count = 0;
		while (true) {
			for (Integer num : numList) {
				if (num % hcf == 0) {
					count++;
				}
			}
			//if all numbers are divisible by hcf
			if (count == numList.size()) {
				break;
			} else {
				count=0;
			}
			hcf--;
		}
		
		return hcf;
	}
	
	private static int max(List<Integer> numList){
		Collections.sort(numList);
		return numList.get(numList.size()-1);
	}
	
	/**
	 * some other way to find HCF
	 */
	// Function to return gcd of a and b 
		static int gcd(int a, int b) 
		{ 
			if (a == 0) 
				return b; 
			return gcd(b % a, a); 
		} 
		
		// Function to find gcd of array of 
		// numbers 
		static int findGCD(int arr[], int n) 
		{ 
			int result = arr[0]; 
			for (int i = 1; i < n; i++) 
				result = gcd(arr[i], result); 

			return result; 
		} 
	
	
	

}







