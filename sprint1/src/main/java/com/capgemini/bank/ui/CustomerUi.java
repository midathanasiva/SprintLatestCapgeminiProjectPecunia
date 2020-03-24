package com.capgemini.bank.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.capgemini.bank.service.UserService;
import com.capgemini.bank.bean.Account;

import com.capgemini.bank.bean.Address;
import com.capgemini.bank.bean.Customer;


import com.capgemini.bank.service.Validation1;
import com.capgemini.exception.AccountNumberException;

public class CustomerUi {
	Validation1 validation=new Validation1(); 
	/**object creation for Validation1 class
	 *object creation for UserService class
	 *object  creation for Account class
	 **/
	Address addressDetails=new Address();              
	//creating objects to bean classes to add and fetch data using setters and getters
	UserService userService=new UserService();
	Customer customerDetails = new Customer();
	Account accountDetails= new Account();
	public void putData() throws AccountNumberException, IOException                   
	//this method is being called from main method
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        /**Java.io.BufferedReader class reads text from a character-input stream, 
        buffering characters so as to provide for 
        the efficient reading of sequence of characters
        */
		
        
		Scanner sc=new Scanner(System.in);		
		/**class is a simple text scanner which can parse primitive types
		 and strings. It internally uses regular expressions to read different types.*/

			while(true) {
				// menu or functionalities which my module does
			System.out.println("==============MENU====================");
	        System.out.println("1. addAccount ");
	        System.out.println("2. Exit.....");					
	        System.out.println("3. GetData using Account Number");
	        System.out.println("4. delete Account");
	      
	          //asking user to choose according to his option
	        String choice;
         try {
				choice = br.readLine();
				switch (choice) {           
				//switch case, to handle based on their choice
				case "1":
				{
					
					System.out.println("********-----------Welcome to Customer Account creation portel-------********");
					System.out.println("\n------------>Enter your 10 digit  Mobile number:<----------");
					while(true)
					{
					customerDetails.setContactNumber(br.readLine());   
					//assigning mobile number to bean class variable
					boolean b1 = validation.isValid(customerDetails.getContactNumber());    
					/**validating the mobile number ,to check whether it is in the expected form or not 
					  retrieving data from bean customer class
					  */
					if(b1 == true)           
						//if it is in expected form then accept else ask user to enter again
					{
							System.out.println("--->accepted mobile number, you r good to go<----");
							//this.number=mobileNumber;
							break;
						
					}
					else
					{
						System.out.println("---->Mobile number  must contain 10 number digits and should start with 6,7,8 or 9.<-----");  
						//asking user to enter valid mobile number
					}
					}
					
					System.out.println("\n\n------->Enter customerName<--------"); 
					//user to enter name
					while(true)
					{
						
					customerDetails.setName(br.readLine());     
					// set the name in bean class
					boolean b2 = validation.validateCustomerName(customerDetails.getName());
					// get the name from bean class to validate
					if(b2 == true)                                         
						//if validated successfully , then okay else again ask the user to enter the name.
					{
							
							
							System.out.println(" its a ---> Name Accepted<----");
							break;
						
					}
					else
					{
						System.out.println("---------------->First character must start with capital letter and name should not be empty<--------------");
					}
					}
					
					
				
					
					System.out.println("\n\n********************Enter 12- digit Aadhar-number**************");
					while(true)
					{System.out.println("Enter here:");
						
						customerDetails.setAadhar(br.readLine());  
						//aadharnumber assigning in customer bean class
					boolean b3 = validation.validateAadhar(customerDetails.getAadhar());
					// validate aadhar
					if(b3 == true)
					{
							
							System.out.println("----> its a <---> Successfully Accepted Aadhar number<----");
							break;
						
					}
					else
					{
						System.out.println("---> Must contain 12 digits only and should nt be empty<-----");
																			// if entered numbers are not exectly 12 then ask to enter again
					}
					}
					
					System.out.println("\n\n********************Enter PAN_CARD_NUMBER**************");
																		//getting PAN Number from the user. 
					while(true)
					{
						System.out.println("Enter here:");
						
					customerDetails.setPanCard(br.readLine());
															//getting number and assigning it in bean class (customer class)
					boolean b1 = validation.validatePan(customerDetails.getPanCard());      
															//validating the data Ex:ASDFG1234F (OR)  ASDFG1234f
					
					if(b1 == true)  
					{
						
							System.out.println("---> Successfully Accepted PAN number<----");
							break;
						
					}
					else
					{
						System.out.println("PAN number must have 10 Alphanumericals ,first 5 should be Capital Alphabits followed by 4 numbers and then the last should be alphabit  Ex:< ---->ASDFG1234R");
					}                             //asking again to enter valid number
					}
					
					System.out.println("\n\n********************Enter DATE_OF_BIRTH**************\n");          
					// getting date_of_birth
					while(true)
					{
					System.out.println("Enter Date_of_Birth -----EX:==> \"mm/dd/yyyy\" --->\" 11/21/2011 \"<-------");
					// validate according to the format
					
					customerDetails.setDob(br.readLine());
					boolean b4 = validation.validateDob(customerDetails.getDob());
					// validating the date
					if(b4 == true)
					{
						//DOB = dob;
							System.out.println("Successfully  Entered your DOB");
							break;
						
					}
					else
					{
						System.out.println("------>DOB should start with Month/day/year Ex.10/22/1999");
					}
					}
				
					
					System.out.println("\n\n********************EnterGender**************\n");    //gender
					while(true)
					{
						String gen;
						
						System.out.println("Select the number according to your gender\n"
								+ "enter \" 1 \" for Male  ----   \"2 \" for Female ---  ");
							gen=sc.next();
							boolean b5 = validation.validateGender(gen);
							  //   validating user , whether he enter valid data or not
					if (b5)
					{
					if(gen.equals("1"))                   
					{
						customerDetails.setGender("Male");
						System.out.println("successfully selected your Gender and that is:"+customerDetails.getGender());
						break;
					}
					else if(gen.equals("2"))
					{
						customerDetails.setGender("female");
						System.out.println("successfully selected your Gender and that is:"+customerDetails.getGender());
						break;
					}
					else                   //asking user to enter valid gender 
					{
						
						System.out.println("------Must select accourding to your Gender");
					}
					}
					
						else
						{
							System.out.println("Enter again");
						}
						}
					
						
					
					
					System.out.println("\n\n********************Enter your address1**************");
					//    user to enter Address1
					System.out.println(" enter village/town ,then \"mandal,\" then \" locality,\" district");
					// enter vill/town, mandal locality
					addressDetails.setAddressLine1(br.readLine());  
					//assigning it to bean(address class)
					System.out.println("\nEnter your city"); //city
					addressDetails.setCity(sc.next());
					System.out.println("\nEnter your country");    //country
					addressDetails.setCountry(sc.next());
				
					System.out.println("\n\n------------> 6 digit zip-code<----------");
					while(true)
					{

						System.out.println("Enter your 6 digit zipcode");  //zipcode
						addressDetails.setZipCode(br.readLine());
					
					                    //assigning zipcode to bean class variable
					boolean b1 = validation.isValidZipCode(addressDetails.getZipCode());   
					/**validating the zipcode ,to check whether it is in the expected form or not 
					   retrieving data from bean Address class
					   */
					if(b1 == true)           
						//if it is in expected form then accept else ask user to enter again
					{
						System.out.println("--->successfully added your zip-code<----");
							//this.number=mobileNumber;
							break;
						}
						
					
					else
					{
						System.out.println("---->zip-code must have exectly 6 digit number. So, must enter your 6 digit code<-----");  
						//asking user to enter valid zip-code
					}
					}
					System.out.println("********************\n\nEnter your address2 if any, else proceed forward**************");//Second address
					
					System.out.println("only enter village/town , mandal, locality, district");
					addressDetails.setAddressLine2(br.readLine()); 
					//assigning to address bean class
					System.out.println("\n\n********************Provide Account Number**************\n");// account number
					
					while(true)
					{
						
						System.out.println("--->DO provide \"  12-digit  \" account number for this account<-----");
					accountDetails.setAccountNumber(br.readLine());                                      
					//setting account number
					boolean b1 = validation.validateAccountNumber(accountDetails.getAccountNumber()); 
					//validating account number
					if(b1 == true)
					{
						try 
						{	
						
							System.out.println(" successfully assigned account Number to the customer<----");
							break;
						}
						catch(Exception e)
						{
							System.out.println("-------------------->Account Number must have only 12 digit number<----------------------");
						}
					}
					else
					{
						System.out.println("------>Account Number must have only 12 digit number<----------");
					}
					}
					
		
	                System.out.println("\n\n********************Provide Branch_Id**************\n");  //Branch Id
					
					while(true)
					{
						
						System.out.println("\n\n-----------"
								+ "provide BranchId  starts with \" SIV\" \" followed by 6 numbers\"   Ex: SIV000001");
						accountDetails.setBranchId(br.readLine());
					boolean b7 = validation.validateBranchId(accountDetails.getBranchId());// valdating Branch Id
					if(b7 == true)
					{
							
						
							System.out.println(" successfully accepted");
							break;
						
					}
					else
					{
						System.out.println("branch id should be of 9 charectors, first 3 should be \"SIV\" followed by 6 digit number Ex:\"SIV000001\"");
					}
					}
					System.out.println("********************Enter  Account_Type**************\n");  //choosing account type;
					while(true)
					{
						String accno;
						try {
					
						System.out.println("Select the number according to the type of account::-->\n" //he has to choose type of account
								+ "enter \" 1 \" for saving account  ----   \"2 \" for student Account"
								+ "\" 3 \" for zero balance Account ---  ");
							accno=sc.next();
							boolean b8 = validation.validateAccountType(accno);
					if (b8)
					{
					if(accno.equals("1"))                     //   validating user , whether he enter valid data or not
					{
						accountDetails.setAccountType("saving_account");
						System.out.println("successfully selected the type of account and that is:"+accountDetails.getAccountType());
						break;
					}
					else if(accno.equals("2"))
					{
						accountDetails.setAccountType("Student_type");
						System.out.println("successfully selected the type of account and that is:"+accountDetails.getAccountType());
						break;
					}
					else if(accno.equals("3"))                  //asking user to enter valid gender 
					{
						
						accountDetails.setAccountType("Zero_Balance");
						System.out.println("successfully selected the type of account and that is:"+accountDetails.getAccountType());
						break;
					}
					else
					{
						System.out.println("Must choose 1 or 2 or 3 ");
					}
					}
					
						else
						{
							System.out.println("Enter again");
						}
						}
					catch(Exception e)
					{
						System.out.println("Enter again");
					}
						
					}
					System.out.println("\n\n******************** Initial Account Balance**************\n");  //to add balance
        			while(true)
        			{ String selNo;
        			
        				System.out.println("Initial  account balance  is \" 0 \"   , Do you want to add \n"
				    		+ "1 for add money            2 not add money ");              // choose option to add or not balance
			             	selNo=sc.next();
							boolean b9 = validation.validateAccountBalance(selNo);
					if (b9)
					{
					if(selNo.equals("1"))                     //   validating user , whether he enter valid data or not
					{
						System.out.println("Enter the amount");
						accountDetails.setBalance(sc.nextDouble());
						System.out.println(" --->Account balance has been successfully updated now updated balance is :"+accountDetails.getBalance()+"<--");
						break;
					}
					
					else
					{
						accountDetails.setBalance(0.0);
						System.out.println(" --->successfully added money and now that is :"+accountDetails.getBalance()+"<--");
						break;

					}
					}
					
						else
						{
							System.out.println("must select 1 or 2 only");
						}
						}
					
						
					
        			
					userService.putData(customerDetails.getAadhar(),customerDetails.getContactNumber(),customerDetails.getName(),customerDetails.getDob(),customerDetails.getGender(),customerDetails.getPanCard(),
							addressDetails.getAddressLine1(),addressDetails.getAddressLine2(),addressDetails.getCity(),
							addressDetails.getCountry(),addressDetails.getZipCode(),accountDetails.getAccountType(),accountDetails.getAccountNumber(),accountDetails.getBranchId(),accountDetails.getBalance());
					                                 
																		//calling UserService class method (putData ) to insert data into the MAP COLLECTIONS
					System.out.println("----------------------------------------"
							+ "------------------------------------------"
							+ "\n\n\n\n");
					System.out.println("---->Account successfully Created<--------");// account created successfully.
					break;
				
			}
					
					                                                                            //case 1 completed
				case "2":
				{
						System.out.println("Thank You have a nice day!"); //used to terminate the module
					   System.exit(0);
	                   break;
				}
	                   
				case "3":                  //to retrieve data from the MAP, COllections using Account number 
				{
					System.out.println("\n--->you are going to retreve data using valid account number<---");
					System.out.println("\n---->Enter valid Account Number<-------");
					String accountNumber=sc.next();
					System.out.println(userService.getdata(accountNumber));       //calling method from UserService class
					System.out.println("done");
					break;
					
				}
				
				
				
				case "4":                           //to delete the account Using Account number;
				{
					System.out.println("\n--->you are going to DELETE Account using  account number<---");
					System.out.println("\n----->Enter  Account Number<---------");
					String accountNumber=sc.next();
					userService.deleteData(accountNumber);   //calling method from UserService class
					System.out.println("successfully deleted");
					System.out.println("done");
					break;
					
				}
     
	            default:
	            {
	            	  
	            	  throw new AccountNumberException("Invalid choice try again");//default option ,it execute only when the above cases fail.
		        }
				}
				}

			
         catch(AccountNumberException e)
         {
        	 System.out.println(e.getMessage());
         
         }
			}
	}


	    
		
	public static void main(String[] args)  throws AccountNumberException, IOException{                //main method  program starts from here
		
		CustomerUi customerUi=new CustomerUi();    //creation of object for this class
		System.out.println("\n-----------*********Welcome to Our Bank Portel*********----------");
		customerUi.putData();// calling the method of this class.
		
		

	        }
	

	
}
