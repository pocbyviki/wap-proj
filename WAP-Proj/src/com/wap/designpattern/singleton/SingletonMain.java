package com.wap.designpattern.singleton;

import java.lang.reflect.Constructor;

class Singleton {

	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		return INSTANCE;
	}
}


 public class SingletonMain {
	public static void main(String [] args) {
		
		Singleton instance1= Singleton.getInstance();
		Singleton instance2= Singleton.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		
		Constructor[] constructors = Singleton.class.getConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			//constructor.newInstance(initargs)
		}
		
		
	
	
	}
 }
 

