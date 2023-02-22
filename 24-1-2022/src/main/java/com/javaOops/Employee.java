package com.javaOops;

public class Employee 
{
	int employeeid;
	String employeename;
	double emplooyeesalary;

	public Employee()
	{
		employeeid = 2345;
		employeename = "Swathi";
		emplooyeesalary = 4546.67;
	}
	
	

	public Employee(int employeeid, String employeename, double emplooyeesalary) {
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.emplooyeesalary= emplooyeesalary;
	}

	public void getswathiinfo()
	{
		System.out.println(employeeid);
		System.out.println(employeename);
		System.out.println(emplooyeesalary);
	}
	
	public static void main(String[] args) 
	{
    Employee s1 = new Employee();
    Employee s2 = new Employee(234, "swa", 5634.67);
    
    s1.getswathiinfo();
    s2.getswathiinfo();
	}

}
