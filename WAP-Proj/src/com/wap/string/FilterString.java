package com.wap.string;
/**
 * WAP to print O/P from given String
 * String String str = "zabpabcdefgxyzbcdzbnmpqrstp";
 * O/P= zpabcdefgxyzbcdzpp
 * condition:1- consider first char to append as answer, if the first char repeat again then append all between chars to
 * answer char, and if next char is p then skip all char between first char occurrence and p. and append only p into answer char.
 * repeat this logic 
 * @author bhara
 *
 */
public class FilterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "zabpabcdefgxyzbcdzbnmpqrstp";
		removeOnCondition(str);
	}
	
	public static void removeOnCondition(String str){
		StringBuilder result = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		char start = 0;
		for(int i=0; i<str.length(); i++) {
			if (i == 0 ) {
				start = str.charAt(i);
				result.append(str.charAt(i));
			} else {
				if (str.charAt(i) == start) {
					result.append(temp);
					result.append(str.charAt(i));
					temp.delete(0, temp.length());
				} else if (str.charAt(i) == 'p') {
					result.append(str.charAt(i));
					temp.delete(0, temp.length());
				} else {
					temp.append(str.charAt(i));
				}
			}
			
		}
		System.out.println(result);
	}
	
	
}
