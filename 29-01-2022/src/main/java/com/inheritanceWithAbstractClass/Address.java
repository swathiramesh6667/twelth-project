package com.inheritanceWithAbstractClass;
	//Abstract Class
	public abstract class Address
	{	
		String learnerAddress;
		String learnerCountry;
		
		public Address()
		{
			learnerAddress = "Myl";
			learnerCountry = "India";
		}
		
		
		public Address(String learnerAddress) 
		{
			this.learnerAddress = learnerAddress;
		}
		
		public void getLearnerAddress()
		{
			System.out.println(learnerAddress);
		}
		
		public abstract void getLearnerCountry();

	}


