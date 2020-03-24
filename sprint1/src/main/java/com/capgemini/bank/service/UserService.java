package com.capgemini.bank.service;
import java.util.HashMap;
import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.bean.Employee;
import com.capgemini.bank.dao.UserDataDao;
public class UserService implements UserServiceInterface{
	 UserDataDao dao=new UserDataDao();  //OBJECT FOR dAO CLASS
	 public  void putData(String aadhar,String contact,String name,String dob,String gender,String pan,String addressLine1,String addressLine2,String city,String country,String zipCode,String accountType,String accountNo,String branchId,double balance)
		{
			dao.putData(aadhar,contact,name,dob,gender,pan,addressLine1,addressLine2,city,country,zipCode,accountType,accountNo,branchId,balance);	
		}// calling method to insert data into the Map
   public Employee getdata(String accountNumber)
   {
	   return dao.getData(accountNumber);//  This method is used to retrieve data from the map
   }
  
   public void deleteData(String accountNumber) {// to delete account
	dao.deleteData(accountNumber);  //calling DAO class object, to delete account 
	
}
	
	

}
