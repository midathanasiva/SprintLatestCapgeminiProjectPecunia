package com.capgemini.bank.bean;

public class Customer {                               //bean class
	private String name;
	private String gender;
	private String aadhar;                              //data members 
	private String panCard;
	private String contactNumber;
	private String dob;
	public String getName() {                                  //getters
		return name;
	}
	public void setName(String name) {                   //setters
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	public Customer() {                   //default constructors
		super();                             //to call parent constructor
	}
	public Customer(String name, String gender, String aadhar, String panCard, String contactNumber, String dob) {
		super();
		this.name = name;
		this.gender = gender;                        //parameterized constructor 
		this.aadhar = aadhar;
		this.panCard = panCard;
		this.contactNumber = contactNumber;
		this.dob = dob;
	}
	@Override
	public String toString() {                   //toString method
		return "UserDeta [" + (name != null ? "name=" + name + ", " : "")
				+ (gender != null ? "gender=" + gender + ", " : "") + (aadhar != null ? "aadhar=" + aadhar + ", " : "")
				+ (panCard != null ? "panCard=" + panCard + ", " : "")
				+ (contactNumber != null ? "contactNumber=" + contactNumber + ", " : "")
				+ (dob != null ? "dob=" + dob : "") + "]";
	}
	
	
	

}
