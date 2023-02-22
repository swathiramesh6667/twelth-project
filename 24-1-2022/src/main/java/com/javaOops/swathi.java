package com.javaOops;

public class swathi 
{
	String name;
	int age;
	String address;
	
	public swathi()
	{
		name = "Swathi";
		age = 23;
		address = "Mayilduthurai";
	}
	
	public void getswathiinfo()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	

	public static void main(String[] args) 
	{
    swathi s = new swathi();
    s.getswathiinfo();
	}

}
