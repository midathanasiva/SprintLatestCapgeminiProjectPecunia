package com.capgemini.bank.bean;

public class Address {                                      //bean class
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;                                 //data members
	private String zipCode;
	public Address() {                                      //default constructors
		super();
	}
	public String getAddressLine1() {                                      //  Method   getters
		return addressLine1;                   
	}
	public void setAddressLine1(String addressLine1) {                       //setter methods
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Address(String addressLine1, String addressLine2, String city, String country, String zipCode) {
		super();                             //to call parent class constructor
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;                             //parameterized parameter
		this.country = country;
		this.zipCode = zipCode;
		toString();
	}
	@Override
	public String toString() {                              //toString Method
		return "AddressDetails [" + (addressLine1 != null ? "addressLine1=" + addressLine1 + ", " : "")
				+ (addressLine2 != null ? "addressLine2=" + addressLine2 + ", " : "")
				+ (city != null ? "city=" + city + ", " : "") + (country != null ? "country=" + country + ", " : "")
				+ (zipCode != null ? "zipCode=" + zipCode : "") + "]";
	}
	
	

}
