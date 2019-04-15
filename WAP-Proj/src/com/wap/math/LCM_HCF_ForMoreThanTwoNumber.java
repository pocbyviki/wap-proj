package com.wap.math;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCM_HCF_ForMoreThanTwoNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter from how many number to calculate HCF:");
		
		/*try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			List<Integer> inList = new ArrayList<>(size);
			for ( int i=0; i<size; i++) {
				System.out.println("Please enter value:");
				inList.add(sc.nextInt());
			}
			System.out.println("Entered Numbers are :"+inList);
			System.out.println("HCF of "+inList+" = "+hcf(inList));
		} catch (Exception ex) {
			
		}*/
		List<Integer> inList = new ArrayList<>();
		//inList.add(10);
		//inList.add(25);
		inList.add(5);
		inList.add(800000000);
		//inList.add(45);
		//inList.add(15);
		
		System.out.println("Entered Numbers are :"+inList);
		System.out.println("Start at "+LocalDateTime.now());
		System.out.println("HCF of "+inList+" = "+hcf(inList));
		System.out.println("End at "+LocalDateTime.now());
		
	}
	
	
	public static int hcf(List<Integer> inList) {
		
		int diff = leastDiff(inList);
		if (diff == 1) {
			return diff;
		}
		
		if (isEachDivisibleByNum(inList, diff)) {
			return diff;
		}
		
		List<Integer> factors = findFactors(diff);
		int hcf =1;
		for (Integer num : factors) {
			if (isEachDivisibleByNum(inList, num)) {
				hcf = hcf*num;
			}
		}
		
		return hcf;
	}
	
	private static boolean isEachDivisibleByNum(List<Integer> inList, int num) {
		
		for (Integer input : inList) {
			if (input % num >= 1) {
				return false;
			}
		}
		
		return true;
	}
	
	private static int leastDiff(List<Integer> inList){
		int leastDiff =1;
		int temp = 1;
		int index=0;
		for (Integer num : inList) {
			int next;
			if (inList.size() == index+1) {
				next = inList.get(0);
			} else {
				next = inList.get(index+1);
			}
			if (index == 0) {
				leastDiff = num > next ? (num-next) : (next -num);
				index++;
			} else {
				temp = num > next ? (num-next) : (next -num);
				if (temp < leastDiff) {
					leastDiff = temp;
				}
				index++;
				
			}
		}
		return leastDiff;
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
	

}
