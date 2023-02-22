package com.encapsulation;
	//Encapsulation: Binding all class properties in one unit

	public class Learner 
	{
		//state (variables)
		int learnerId;
		String learnerName;
		
		
		public Learner()
		{
			// TODO Auto-generated constructor stub
		}

		public Learner(int learnerId, String learnerName) {
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
			Learner learner1 = new Learner(23, "Jayesh");
			learner1.getLearnerInfo();
		}
		
		
	}
