package com.wap.designpattern.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton INSTANCE = null;
	
	private ThreadSafeSingleton() {
		System.out.println("--------------private Constructor invoked-------------");
	}
	
	public static ThreadSafeSingleton getInstance(){
		
		if (INSTANCE == null) {
			synchronized(ThreadSafeSingleton.class){
				 if (INSTANCE == null) {
					 INSTANCE = new ThreadSafeSingleton();
				 }
			}
		}
		return INSTANCE;
	}
	
	public  void  getThreadNames(){
		System.out.println(Thread.currentThread().getName());
	}
}
