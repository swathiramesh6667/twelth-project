package com.javaOops;

public class Employee 
{
	int Id;
	String Name;
	
	public void setId(int id) {
		Id = id;
	}



	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + "]";
	}



	public static void main(String[] args) 
	{
     Employee employee = new Employee();
     
     employee.setId(1702);
     employee.setName("Swa");
     
     System.out.println(employee);
	}

}
