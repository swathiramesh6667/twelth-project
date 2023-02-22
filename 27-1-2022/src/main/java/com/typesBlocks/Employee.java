package com.typesBlocks;

/**
 * 
 * In Class We have Two types of Blocks:
 * 
 * 1. Instance initializer block:
 * 
 * By using this block we can initialize non-static/object/instance variables
 * 
 * 
 * 2. static block:
 * 
 * By using this block we can initialize static/class variables
 * 
 */

public class Employee 
{
private int EmployeeId;
private String EmployeeName;
private String EmployeeAddress;

static double EmployeeSalary;

public Employee()
{
	
}
{
	EmployeeId=456;
	EmployeeName="Jin";	
	EmployeeAddress="Seol";
}

static
{
	EmployeeSalary= 20000;
}
	

public static void main(String[] args) 
{
Employee employee = new Employee();

System.out.println(employee.EmployeeId);
System.out.println(employee.EmployeeName);
System.out.println(employee.EmployeeAddress);

System.out.println("================");

System.out.println(Employee.EmployeeSalary);
	}

}
