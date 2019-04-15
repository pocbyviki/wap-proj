package com.wap.serialization;
/**
 * what will happen? if Parent do not implements Serializable and Child implements Serializable
 * @author bhara
 *
 */
public class Parent {

	private String parentName;
	private int parentAge;
	
	public Parent() {
		
	}
	
	public Parent(String parentName, int parentAge) {
		super();
		this.parentName = parentName;
		this.parentAge = parentAge;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public int getParentAge() {
		return parentAge;
	}
	public void setParentAge(int parentAge) {
		this.parentAge = parentAge;
	}
	
	
	
}
