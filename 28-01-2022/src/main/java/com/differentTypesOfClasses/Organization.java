package com.differentTypesOfClasses;


//interface class
public abstract interface Organization 
{
	
	//The blank final field orgName may not have been initialized
	
	//variables
	
	//no non-static variables
	
	//no static variables
	
	//** final variables: in interface by default all variables are final variables
	
	int orgId = 3039;
	String orgName = "TCS";
	
	//no constructor
	
	//no blocks
	
	//methods
	
	//no non-static methods
	
	//static methods
	public static void getOrgDetails()
	{
		System.out.println(orgId);
		System.out.println(orgName);
	}	
	
	//**abstract methods: in interface by default all methods are abstract methods
	public abstract void getOrgId();
	
	public static void main(String[] args) 
	{
		//Cannot instantiate the type Organization
		//Organization organization = new Organization();
	}
	
}
