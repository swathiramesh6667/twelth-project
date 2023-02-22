package com.thisMethod;

//constructor chaining
public class Employee 
{
	
	int id;
	String name;
	
	public Employee() 
	{
		//this(89, "B1");//calling parameterized constructor
		System.out.println("default constructor");
	}

	public Employee(int id, String name) 
	{
		/**
		 * Constructor call must be the first statement in a constructor
		 */
		this();//calling default constructor
		this.id = id;
		this.name = name;
		System.out.println("parameterized constructor");
		
	}
	
	public static void main(String[] args)
	{
		//Employee employee1 = new Employee();
		Employee employee2 = new Employee(89, "B1");
	}
	

}
