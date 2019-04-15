package com.wap.designpattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		
		//ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor = Executors.newFixedThreadPool(100);
		for(int i=0; i<100; i++){
			executor.execute(new Runnable() {
				
				@Override
				public void run() {
					ThreadSafeSingleton.getInstance().getThreadNames();
				}
			});
		}
		executor.shutdown();
	}

}
