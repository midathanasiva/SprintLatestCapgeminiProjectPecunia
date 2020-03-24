package test1;
//package junit1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.capgemini.bank.service.Validation1;



 



public class Testing {
	Validation1 v1 = new Validation1();
	@Test
	void test() {
		
		
	boolean res=	v1.validatePan("AsDFQ1234E");
	assertFalse(res);
	}
	@Test
	void test1() {	
	boolean res=	v1.validateCustomerName("Sivasiri");
	assertTrue(res);
	}
	@Test
	void test2() {	
	boolean res=v1.validateCustomerName("6666");
	assertFalse(res);
	}
	@Test
	void test3() {
	boolean res=	v1.validateDob("11/20/2020");
	assertTrue(res);
	
	}
	@Test
	void test4() {
	boolean res=	v1.validateDob("02/11/2020");
	assertTrue(res);
	
	}
	@Test
	void test5() {
	boolean res=	v1.validateAccountNumber("123456789012");
	assertTrue(res);
	
	}@Test
	void test6() {
	boolean res=	v1.validateAccountNumber("aswe12345");
	assertFalse(res);
	
	}
	@Test
	void test7() {
		boolean res=v1.validateAccountNumber("123456123456");
		assertTrue(res);
		
		}
	@Test
	void test9() {
		boolean res=	v1.validateAccountNumber("123450987667");
		assertTrue(res);
		
		}
	@Test
	void test10() {
		boolean res=	v1.validateBranchId("siv123456");
		assertFalse(res);
		
		}@Test
	void test11() {
			boolean res=	v1.validateBranchId("SIVA12345");
			assertFalse(res);
			
			}@Test
	void test12() {
				boolean res=	v1.validateBranchId("SIV123456");
				assertTrue(res);
				
				}
	
	
	
	
	
	
	
	
	
	
	
	

}
