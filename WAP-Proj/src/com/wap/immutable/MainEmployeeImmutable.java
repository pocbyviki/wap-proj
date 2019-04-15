package com.wap.immutable;
/**
 * 
 * @author bhara
 *
 */
 final class EmployeeImmutable {

	private final String empName;
	private final String empMobile;
	
	public EmployeeImmutable (String empName, String empMobile) {
		this.empName = empName;
		this.empMobile = empMobile;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	@Override
	public String toString() {
		return "EmployeeImmutable [empName=" + empName + ", empMobile=" + empMobile + "]";
	}
	
	
	
}
	

public class MainEmployeeImmutable{
	public static void main(String[] args) {
		EmployeeImmutable emp1 = new EmployeeImmutable("Vivek", "9022535070");
		System.out.println(emp1);
		EmployeeImmutable emp2 = new EmployeeImmutable("Anjali", "8097556273");
		System.out.println(emp2);
		
	}
}
