package com.capgemini.bank.dao;

import com.capgemini.bank.bean.Employee;

public interface UserDataDaoInterface { 
	
	// INTERFACE  , don't know what to implement, i will implement later these methods 
	public void putData(String aadhar,String contact,String name,String dob,String gender,String pan,String addressLine1,String addressLine2,String city,String country,String zipcode,String accounttype,String accountNo,String branchId,double balance);
	public Employee getData(String accountNumber);    
	
	// method declaration to retrieve data
	void deleteData(String accountNumber);
	
	// method declaration  to delete data
}
