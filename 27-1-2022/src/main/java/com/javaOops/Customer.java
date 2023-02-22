package com.javaOops;

public class Customer 
{

	//State Variable
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	public Customer()
	{
		
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	public static void main(String[] args) 
	{
		
	Customer customer = new Customer();
	
	customer.setCustomerId(1998);
	customer.setCustomerName("Swathi");
	customer.setCustomerAddress("Myl");
	
	System.out.println(customer);
	System.out.println("======================");
	
	Customer customer1 = new Customer();
	
	customer1.setCustomerId(1997);
	customer1.setCustomerName("Jeon");
	customer1.setCustomerAddress("Seol");
	
	System.out.println(customer1);
	
	}
}
