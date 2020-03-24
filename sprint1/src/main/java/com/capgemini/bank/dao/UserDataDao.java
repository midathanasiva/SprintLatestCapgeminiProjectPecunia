package com.capgemini.bank.dao;
import java.util.Map;
import com.capgemini.bank.bean.*;
import com.capgemini.bank.service.*;
import com.capgemini.bank.service.*;
import com.capgemini.bank.util.CollectionUtil;
//import com.capgemini.bank.bean.;

public class UserDataDao implements UserDataDaoInterface {
	CollectionUtil colu = new CollectionUtil();  //object of CollectionUtil
	public void putData(String aadhar,String contact,String name,String dob,String gender,String pan,String addressLine1,String addressLine2,String city,String country,String zipcode,String accounttype,String accountNo,String branchId,double balance)
	{
		//this is a method to add data to Map
		colu.details().put(accountNo,new Employee(new Account(accounttype,balance,accountNo,branchId),new Address(addressLine1,addressLine2,city,country,zipcode), new Customer(name,gender,aadhar,pan,contact,dob)));
	}
	public Employee getData(String accountNumber)
    {
		// to retrieve data
		return  (Employee) colu.details().get(accountNumber);	
	}
	public void deleteData(String accountNumber) {
//		to delete data
	  colu.details().remove(accountNumber);
	
	
	}


	
	
		
}
	
