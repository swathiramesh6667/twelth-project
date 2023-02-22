package com.typesOfVariable;
/**
 * 
 * In Class We have Two types of variables
 * 
 * 1. non-static variables:
 * 
 * The variables which are not declared with "static" keyword
 * 
 * Sometimes these variables also called as "instance/object" variables,
 * 
 * Reason: Because we need to create object/instance to call these variables.
 * ======
 * 
 * 2. static variables:
 * 
 * The variables which are declared with "static" keyword
 * 
 * Sometimes these variables also called as "class" variables,
 * 
 * Reason: Because We are calling these variables by using class name.
 * ======
 */
public class Employee 
{

	private int EmployeeId;
	private String EmployeeName;
	
	static String EmployeeAddress;
	
	public Employee()
	{
		EmployeeId=2021;
		EmployeeName="BTS";
		
		EmployeeAddress="Korea";
	}
	
	public static void main(String[] args) 
	{
      Employee employee = new Employee();
      
      System.out.println(employee.EmployeeId);
      System.out.println(employee.EmployeeName);
      
      System.out.println("-------------------");
      
      System.out.println(Employee.EmployeeAddress);
      
      
	}

}
