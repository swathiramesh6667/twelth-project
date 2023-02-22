package com.inheritanceAdvance;

//Address: super/parent/base class
public class Address
{
	
	String learnerAddress;
	
	public Address()
	{
		learnerAddress = "India";
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
