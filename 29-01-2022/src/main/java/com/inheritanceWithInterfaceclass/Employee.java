package com.inheritanceWithInterfaceclass;

//normal class
public class Employee implements Country 
{

	int EmployeeId;
	String EmployeeName;

	public Employee()
	{
		EmployeeId=1998;
		EmployeeName="Swathi";
	}

	public Employee(int employeeId, String employeeName) 
	{
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
	}

	public void getemployeeinfo()
	{
		System.out.println(EmployeeId);
		System.out.println(EmployeeName);
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.getemployeeinfo();
	}

	@Override
	public void getCountryName() 
	{
		System.out.println(CountryName);		
	}

}

