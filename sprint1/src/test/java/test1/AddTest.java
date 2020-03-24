package test1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

import org.junit.jupiter.api.Test;

import com.capgemini.bank.bean.Account;
import com.capgemini.bank.bean.Address;
import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.bean.Employee;
import com.capgemini.bank.util.CollectionUtil;

class AddTest {

	@Test
	void test() {
        
		CollectionUtil u = new CollectionUtil();
		 u.details().put("12",new Employee(new Account("saving",1002.00,"123456789012","SIV000100"), new Address("GANGAVGYHARM NATHAVSARAM","GANGAVSWEARM NATHARAM","VISAKHAPATN","australia","539115"), new Customer("siva","MALE","121212121333","ASDFG1234j","8108690185","01/12/2020")));
	    assertEquals( u.details().put("12",new Employee(new Account("saving",1002.00,"123456789012","SIV000100"), new Address("GANGAVGYHARM NATHAVSARAM","GANGAVSWEARM NATHARAM","VISAKHAPATN","australia","539115"), new Customer("siva","MALE","121212121333","ASDFG1234j","8108690185","01/12/2020"))), u.details().get("12"));
	}

}
