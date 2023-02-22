package com.differentTypesOfClasses;


//Normal class
public class Employee 
{
	//variables	
	int id;
	String name;
	double salary;
	
	static String orgName;
	
	public Employee()
	{		
		id = 4049;
		name = "Fathima";
		salary = 84943.45;
	}
	
	//instance initializer block
	{
		
	}
	
	//static block
	static
	{
		orgName = "IBM";
	}
	
	//methods
	public void getData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void getOrgName()
	{
		System.out.println(orgName);
	}
	
	public static void main(String[] args) 
	{		
		//objects
		Employee employee = new Employee();
	}
	
}
