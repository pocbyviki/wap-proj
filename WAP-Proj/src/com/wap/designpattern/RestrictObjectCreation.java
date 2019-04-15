package com.wap.designpattern;
/**
 * 17-	Write a program to restrict not to create more than 3 instance of a class
 * @author bhara
 *
 */
public class RestrictObjectCreation {


	private static RestrictObjectCreation instance = null;
	private static int count =1;
	private RestrictObjectCreation() {
		count++;
	}
	
	
	public static RestrictObjectCreation newInstance() {
		
		if (count <= 3) {
			instance = new RestrictObjectCreation();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		RestrictObjectCreation obj1= RestrictObjectCreation.newInstance();
		RestrictObjectCreation obj2= RestrictObjectCreation.newInstance();
		RestrictObjectCreation obj3= RestrictObjectCreation.newInstance();
		RestrictObjectCreation obj4= RestrictObjectCreation.newInstance();
		RestrictObjectCreation obj5= RestrictObjectCreation.newInstance();
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj3.equals(obj4));
		System.out.println(obj4.equals(obj5));
		
	}
	
	
}


