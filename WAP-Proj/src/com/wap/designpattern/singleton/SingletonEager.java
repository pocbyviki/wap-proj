package com.wap.designpattern.singleton;

public class SingletonEager {

	private static final SingletonEager INSTANCE = new SingletonEager();
	
	//preventing Object creation from outside
	private SingletonEager() {
		
	}
	
	public SingletonEager getInstance() {
		
		return INSTANCE;
	}
	
}

//SingletonEagerWithStaticBlock
class SingletonEager2{

	private static SingletonEager2 instance;
	
	static {
		instance = new SingletonEager2();
	}
	
	// to prevent object creation from outside
	private SingletonEager2() {
		
	}
	
	public SingletonEager2 getInstance() {
		
		return instance;
	}
}

class SingletonLazy {
	
}




