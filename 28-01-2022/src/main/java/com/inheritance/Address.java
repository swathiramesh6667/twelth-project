package com.inheritance;

public class Address
{
	
	String learnerAddress;
	
	public Address()
	{
		learnerAddress = "Pune";
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
