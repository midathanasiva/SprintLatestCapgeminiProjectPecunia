package com.capgemini.bank.bean;

public class Employee {                                            //Employee class , initialized bean class
	Account account;
	Address address;                        //these are member of type bean classes , used to create objects
	Customer customer;
	@Override
	public String toString() {                 //toString Method
		return "Employee [" + (account != null ? "account=" + account + ", " : "")
				+ (address != null ? "address=" + address + ", " : "")
				+ (customer != null ? "customer=" + customer : "") + "]";
	}
	public Employee() {                                  //Default constructor
		super();
	}
	
	public Account getAccount() {
		return account;
	}
	public Employee(Account account, Address address, Customer customer) {  //parameterized constructor
		super();
		this.account = account;
		this.address = address;
		this.customer = customer;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
