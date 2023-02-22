package com.javaOops;

public class Learner 
{
	int id;
	String name;
	String address;
	String city;
	
	public Learner()
	{
		id = 4567; 
		name = "Swathi";
		address = "Mayilduthurai";
		city = "Mayilai";
	}
	
	
	public Learner(int id, String name, String address, String city) {
	
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
	}


	public void getswathiinfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
	}
	

	public static void main(String[] args) 
	{
    Learner s1 = new Learner();
    Learner s2 = new Learner(234, "swa", "myl", "sss");
    
    s1.getswathiinfo();
    s2.getswathiinfo();
	}

}
