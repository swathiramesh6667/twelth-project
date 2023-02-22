package com.differentTypesOfClasses;

	//Abstract class
	public abstract class Address
	{

		//variables	
		String address;
		
		static String countryName;
		
		
		public Address() 
		{
			// TODO Auto-generated constructor stub
		}
		
		//blocks	
		//instance initializer block
		{
			address = "Pune";
		}
		
		//static block
		static
		{
			countryName = "India";
		}
		
		//methods
		public void getAddress()
		{
			System.out.println(address);
		}
		
		public static void getCountry()
		{
			System.out.println(countryName);
		}
		
		/**
		 * abstract method:
		 * 
		 * 1. Abstract methods do not specify a body or have a body part
		 */
		
		public abstract void getEmployeeAddress();
		
		public static void main(String[] args) 
		{
			//Cannot instantiate/create an object to the type Address
			//Address address = new Address();
		}
	}

