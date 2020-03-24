package com.capgemini.bank.bean;

public class Account {                                                  //this is a bean class with name Account
	private String accountType;
	private Double balance;
	private String accountNumber;                                       //data members 
	private String branchId;
	public Account() {                                    //default constructors
		super();                                 //to cal super class    
	}
	public String getAccountType() {                                     // getters
		return accountType;
	}
	
	public void setAccountType(String accountType) {                     // setter
		this.accountType = accountType;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public Account(String accountType, Double balance, String accountNumber, String branchId) {
		super();
		this.accountType = accountType;             //Parameterized constructors
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.branchId = branchId;
	}
	@Override
	public String toString() {                     //toString method
		return "AccountDetails [accountType=" + accountType + ", balance=" + balance + ", accountNumber="
				+ accountNumber + ", branchId=" + branchId + "]";
	}


}
