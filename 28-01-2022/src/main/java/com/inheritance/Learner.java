package com.inheritance;

//Inheritance: "Reusing" the class properties by another class
public class Learner extends Address
{
	//state (variables)
	int learnerId;
	String learnerName;


	public Learner()
	{
		learnerId = 7829;
		learnerName = "Ajay Kumar";
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
		System.out.println(learnerAddress);
	}
	
	public static void main(String[] args) 
	{
		Learner learner = new Learner();
		learner.getLearnerInfo();
	}

}
