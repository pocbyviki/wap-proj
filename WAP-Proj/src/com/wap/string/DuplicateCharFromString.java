package com.wap.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * FAQ- find duplicate characters count and print them?
 * @author bhara
 *
 */
public class DuplicateCharFromString {

	public static void main(String[] args) {

		String str = "Hello World";
		//String str = "The quick brown fox jumped over the lazy dog.";
		//findDuplicatUsingJava8(str);
		//findDuplicatUsingLoop(str);
		//findDuplicateUsingArrays(str);
		findDuplicateUsingMap(str);
		
	}
	/**
	 * using only one loop, would be faster
	 * @param str
	 */
	private static void findDuplicateUsingMap(String str) {
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int count =map.get(ch);
				map.put(ch, ++count);
			} else {
				map.put(ch, 1);
			}
		}
		map.forEach((k,v) -> {if (v>1) {System.out.println(""+k+"="+v);}});// print only duplicate i.e. value>1
		System.out.println(map);
		
	}

	private static void findDuplicateUsingArrays(String str) {
		String[] stringarray= str.split("");
		Map<String , Long> map =  Arrays.stream(stringarray)
		        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
		        map.forEach( (k, v) -> System.out.println(k + " : "+ v));
		
	}

	/**
	 * this one using two loop, so time complexity will be high
	 * @param str
	 */
	private static void findDuplicatUsingLoop(String str) {
		
		Map<Character, Integer> map = new HashMap();
		Set<Character> duplicateChars = new HashSet();
		for (int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			int count=1;
			if (!duplicateChars.contains(ch)) {
				for (int j=i+1; j<str.length(); j++) {
					char nextChar = str.charAt(j);
					 if (ch == nextChar) {
						map.put(ch, ++count);
						duplicateChars.add(nextChar);
					}
				}
			}
		}
		System.out.println("Duplicate Character and count(using loop):"+map);
	}

	private static void findDuplicatUsingJava8(String str) {
		String temp =null;
		int count = 1;
		List<String> list = new ArrayList();
		
		Map<String, Long> map = str
		.chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		
		System.out.println("Duplicate Character and count(using java8):"+map);
		System.out.println("duplicat Char:"+list);
	}

}
