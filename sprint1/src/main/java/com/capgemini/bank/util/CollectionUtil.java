package com.capgemini.bank.util;
import java.util.*;

import com.capgemini.bank.*;
import com.capgemini.bank.bean.Account;
import com.capgemini.bank.bean.Address;
import com.capgemini.bank.bean.Employee;
import com.capgemini.bank.bean.Customer;

public class CollectionUtil {
	
		
	Map<String,Employee> data=new HashMap<String,Employee>();   //to create Map  , creating Map;
	
	public CollectionUtil() {
		
		data.put("123456789012",new Employee(new Account("saving",1002.00,"123456789012","SIV000100"), new Address("GANGAVGYHARM NATHAVSARAM","GANGAVSWEARM NATHARAM","VISAKHAPATN","australia","539115"), new Customer("siva","MALE","121212121333","ASDFG1234j","8108690185","01/12/2020")));
		data.put("234567890123",new Employee(new Account("student_Account",1003.00,"23456789012","SIV000100"), new Address("GAAQNGAVARM NATFGHAVARAM","GANGJJAVARM NATHdAVARAM","VISRTAKPATNAM","bhutan","651115"), new Customer("SIRI","female","131212121212","ASDFG1234h","8028690185","01/12/2111")));
		data.put("345678901234",new Employee(new Account("saving",1004.00,"345678901234","SIV000100"), new Address("GANGAVAFRRM NATHAVARGFAM","GANGGAVARM NATHAJVDFARAM","VISAKPDFATNAM","lanka","561115"), new Customer("RAJEE","female","121212121232","ASDFG1234R","8008090185","01/12/202")));
		data.put("444444444444",new Employee(new Account("student_Account",1005.00,"444444444444","SIV000100"), new Address("ERGANGAVAVDRM NATHAVARAM","GANGAVHARM NAFRTTHAVARAM","VISDAKHPATNAM","INDIA","531115"), new Customer("VIKHI","female","121219131212","ASDFG1234g","8008890185","01/12/1020")));
		data.put("555555555555",new Employee(new Account("saving",1006.00,"555555555555","SIV000100"), new Address("GANGAVARRM NATHAVARBHAM","GANGTYGAVARM NATHAHVABHRAM","VINSAKHAPATGNAM","china","551115"), new Customer("SIRI","female","121212188212","ASDFG1284R","8008610185","01/12/2030")));
		data.put("666666666666",new Employee(new Account("student_Account",10061.00,"666666666666","SIV000100"), new Address("GARNGAVARM NAKTHFAVARAM","GANGGAVARM NATHFAVARAM","VIGSAKHGAPATNAM","pakistan","544415"), new Customer("SIRI","female","111112121212","ASDFG1234a","8008790185","01/12/2010")));
		data.put("777777777777",new Employee(new Account("zero_account",1002.00,"777777777777","SIV000100"), new Address("GANGAEVARM NATHASDWEVARAM","GANGAVCARM NATHAVQARAM","VISARKHAGPATNAM","uk","531444"), new Customer("AMMA","female","121333321212","ASDFG1234z","8008630185","01/12/2550")));
	// static data , when we run a program , data is added to Map. Static data
	}
	
	public Map details()
	{
		return data;
	}

	

}
