package com.inheritanceAdvance;

//Learner: sub/child/derived class
public class Learner extends Address
{

	int learnerId;
	String learnerName;


	public Learner()
	{
		learnerId = 1998;
		learnerName = "Swathi";
	}

	public Learner(int learnerId, String learnerName) 
	{
		this.learnerId = learnerId;
		this.learnerName = learnerName;
	}

	public void getLearnerInfo()
	{
		System.out.println(learnerId);
		System.out.println(learnerName);
	}
	
	public static void main(String[] args) 
	{
		//creating object for sub class
		Learner learner = new Learner();
		
		learner.getLearnerInfo();//sub
		learner.getLearnerAddress();//super
		
		System.out.println("=====================");
		
		//creating object for super class
		Address address1 = new Address();
		
		address1.getLearnerAddress();//super
		//address.getLearnerInfo();
		
		System.out.println("=====================");
		
		Address address2 = new Learner();//sub to super => this will work
		
		address2.getLearnerAddress();//super
		//address2.getLearnerInfo();
		
		System.out.println("=====================");
		
		//Learner learner1 = new Address();//super to sub => this will not work
		
	}

}
