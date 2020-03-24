package com.capgemini.bank.service;

import com.capgemini.bank.bean.Employee;

public interface UserServiceInterface {
	// INTERFACE  , don't know what to implement, i will implement later these methods 
	 public  void putData(String aadhar,String contact,String name,String dob,String gender,String pan,String addressLine1,String addressLine2,String city,String country,String zipCode,String accountType,String accountNo,String branchId,double balance);
	 public Employee getdata(String accountNumber);// method declaration to retrieve data
	 public void deleteData(String accountNumber);// method declaration  to delete data
}
