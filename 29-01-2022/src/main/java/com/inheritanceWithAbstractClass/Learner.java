package com.inheritanceWithAbstractClass;

	//Normal Class
	public class Learner extends Address
	{
		//state (variables)
		int learnerId;
		String learnerName;


		public Learner()
		{
			learnerId = 456;
			learnerName = "Swa";
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
		
		//here we are given body/implementation to abstract method of Address class
		public void getLearnerCountry() 
		{
			System.out.println(learnerCountry);		
		}	
		
		public static void main(String[] args) 
		{
			Learner learner = new Learner();
			learner.getLearnerInfo();
			learner.getLearnerCountry();
		}

		
		

	}
