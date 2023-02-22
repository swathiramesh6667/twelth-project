package com.typeOfMethods;

/**
 * 
 * In Class We have Two types of Methods
 * 
 * 1. non-static methods:
 * 
 * The methods which are not declared with "static" keyword.
 * 
 * Sometimes these methods also called as "instance/object" methods,
 * 
 * In these methods we can able to call both variables(non-static and static)
 * 
 * Reason: Because we need to create object/instance to call these methods.
 * ======
 * 
 * 2. static methods:
 * 
 * The methods which are declared with "static" keyword
 * 
 * Sometimes these methods also called as "class" methods,
 * 
 * In these methods we can able to call only static variables
 * 
 * Reason: Because We are calling these methods by using class name.
 * ======
 */
public class Employee 
{

	private int EmployeeId;
	private String EmployeeName;
	
	static String EmployeeAddress;
	
	public Employee()
	{
		
	}
	{
		EmployeeId=2022;
		EmployeeName="Teakook";
	}
	static
	{
		EmployeeAddress="Busan";
	}
	public void getEmployeedetails()
	{
		System.out.println(EmployeeId);
		System.out.println(EmployeeName);
	}
	public static void getemployeedetails()
	{
		System.out.println(EmployeeAddress);
	}
	public static void main(String[] args) 
	{
    Employee employee = new Employee();
    
    employee.getEmployeedetails();
    
    System.out.println("-----------------------------");
    
    employee.getEmployeedetails();
  
	}

}
