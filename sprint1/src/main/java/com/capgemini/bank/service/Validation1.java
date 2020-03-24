package com.capgemini.bank.service;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
public class Validation1 {
		public   boolean isValid(String mobileNumber) {

			// The given argument to compile() method 
			// is regular expression. With the help of 
			// regular expression we can validate mobile 
			// number. 	
			// 2) Then contains   6 0r7 or 8 or 9. 
			// 3) Then contains 9 digits 
			Pattern p = Pattern.compile("[6-9][0-9]{9}"); 
			// Pattern class contains matcher() method 
			// to find matching between given number 
			// and regular expression 
			Matcher m = p.matcher(mobileNumber); 
			return (m.find() && m.group().equals(mobileNumber)); 
		}
		public  boolean validateCustomerName(String customerName) {// to validate customerName
			return customerName.matches( "[A-Z][A-Za-z]*" );
		}
		public  boolean validateAadhar(String aadhar) {           //to validate aadhar number should be 12 numbers
			//Pattern p = Pattern.compile("[0-9]{12}"); 
			
			return aadhar.matches("[0-9]{12}");// checks for 12 digit number
		}
		public  boolean validatePan(String panCard) {  //to validate PAN-CARD  first 5 upper-case alphabets followed by
		
			//4 numbers then 1 uppercase;
		 
			return panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]");
		}
	/*
	 * public boolean validateDob(String dob) { //checks for date of birth format.
	 * String str=dob; boolean a; SimpleDateFormat sdf = new
	 * SimpleDateFormat("MM/dd/yyyy"); sdf.setLenient(false); try { Date d1 =
	 * sdf.parse(str); a=true; } catch (Exception e) { a=false; } return a; }
	 */
		
		 public static boolean validateDob(String dob) 
		    { 
		        String regex = "^(1[0-2]|0[1-9])/(3[01]"
		                       + "|[12][0-9]|0[1-9])/[0-9]{4}$"; 
		        Pattern pattern = Pattern.compile(regex); 
		        Matcher matcher = pattern.matcher((CharSequence)dob); 
		        return matcher.matches(); 
		    } 
		  
		
		
		
		
		
		
		
		
		
		
		
		
		public  boolean validateAccountNumber(String accountNumberCreation) {  //to check for account 
			                                                              //number it should be 12 numbers
			// TODO Auto-generated method stub
			return accountNumberCreation.matches("[0-9]{12}");  //checking for 12 numbers
		}
		public boolean validateBranchId(String branchId) {// to validate for branch id;
			return branchId.matches("[S][I][V][0-9]{6}");  //first 3 should be {SIV} then the rest 6 should be numbers.
		}
		public boolean isValidZipCode(String zipCode) {  //to validate zip-code ,should be 6 numbers
			// TODO Auto-generated method stub
			return zipCode.matches("[0-9]{6}");   //accept 6 numbers that too from 0-9;
		}
		public boolean validateGender(String gender) {
			
			//validating for gender , it check for 1 and 2 based on that we should return true or false
			return gender.matches("[1-2]"); 
		}
		public boolean validateAccountType(String accounttype) {
			return accounttype.matches("[1-3]");
			//validating account type
		}
		public boolean validateAccountBalance(String selectOption) {
			return selectOption.matches("[1-2]");
			// validating for add  the balance
			
		}
			
			

	
	
	
	
	
	
	
	
	

}
