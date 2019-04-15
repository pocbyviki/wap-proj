package com.wap.math;

import java.util.ArrayList;
import java.util.List;

public class LCM_HCF_ForTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2,3--1 | 12,16--4 | 18,22--2 | 945,2475--45
		System.out.println("HCF ="+hcf(5,7));
		
	}

	public static int hcf(int val1, int val2) {
		
		int diff = diff(val1, val2);
		if (diff == 1) {
			return diff;
		}
		
		if (isBothDivisibleByNum(val1, val2, diff)) {
			return diff;
		}
		
		List<Integer> factors = findFactors(diff);
		int hcf = 1;
		for (Integer num : factors) {
			if(isBothDivisibleByNum(val1, val2, num)) {
				hcf = hcf * num;
			}
		}
		return hcf;
	}
	
	private static List<Integer> findFactors(int diff){
		List<Integer> list = new ArrayList<>();
		if (isPrime(diff)) {
			list.add(diff);
			list.add(1);
		} else {
			list = findFactors(diff, 2, 1, list);
		}
		
		return list;
	}
	
	private static List<Integer> findFactors(int diff,int start,int temp,List<Integer> list){
		if (diff == 1) {
			return list;
		}
		
		int remainder = diff % start;
		if (remainder == 0) {
			list.add(start);
			temp =diff/start;
			if (temp == 1) {
				list.add(1);
			}
		} else {
			if(isPrime(diff)) {
				list.add(diff);
				list.add(1);
				return list;
			} else {
				++start;
			remainder = diff % start;
			if (remainder == 0) {
				list.add(start);
				temp =diff/start;
				if (temp == 1) {
					list.add(1);
				}
			}
			}
			
		}
		
		return findFactors(temp, start, temp, list);
	}
	
	private static boolean isPrime(int diff) {
		if (diff <=0) {
			return false;
		}
		
		for (int factor =2; factor<diff; factor++) {
			if (diff % factor == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isBothDivisibleByNum(int val1,int val2,int num) {
		
		int remainder1 = val1 % num;
		int remainder2 = val2 % num;
		
		if (remainder1 == 0 && remainder2 == 0) {
			return true;
		}
		return false;
	}
	
	
	private static int diff(int val1,int val2){
		return val1 > val2 ? (val1-val2) : (val2-val1);
	}
}
