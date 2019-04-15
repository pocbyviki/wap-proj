package com.wap.serialization;

import java.io.Serializable;

public class Child extends Parent implements Serializable{

	private String childName;
	private int childAge;
	
	public Child (){
		
	}
	public Child(String childName, int childAge) {
		this.childName = childName;
		this.childAge = childAge;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public int getChildAge() {
		return childAge;
	}
	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}
	
	
}
