package com.thisKeyword;

public class Employee 
{
 private int EmployeeId;
 private String EmployeeName;
 
 static String EmployeeAddress;
 
 public Employee()
 {
	 
 }
 
 	public Employee(int employeeId, String employeeName) 
 	{
 		
	this.EmployeeId = employeeId;
	this.EmployeeName = employeeName;
}

 	
 	
 	static
 	{
 		EmployeeAddress= "Seol";
 	}
 	
 	public void getemployeedetails()
 	{
 		System.out.println(EmployeeId);
 		System.out.println(EmployeeName);
 		System.out.println(EmployeeAddress);
 	}
	public static void main(String[] args) 
	{
     Employee employee = new Employee(1,"Kimteahyung");
     
     employee.getemployeedetails();
     
     System.out.println("-------------------");
     
     Employee employee1 = new Employee(10,"Jeonjungkook");
     
     employee1.getemployeedetails();
     
     
	}

}
