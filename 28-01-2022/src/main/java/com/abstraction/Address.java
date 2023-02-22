package com.abstraction;

public class Address 
{
	private String learnerAddress;
	String learnerCountryName;
	
	public Address()
	{
		learnerAddress = "Pune";
		learnerCountryName = "India";
	}
	
	
	public Address(String learnerAddress) 
	{
		this.learnerAddress = learnerAddress;
	}
	
	public void getLearnerAddress()
	{
		System.out.println(learnerAddress);
	}

}


