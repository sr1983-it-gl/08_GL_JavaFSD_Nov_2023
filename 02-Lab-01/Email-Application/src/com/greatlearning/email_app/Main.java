package com.greatlearning.email_app;

public class Main {

	public static void main(String[] args) {
		
		testEmailAddressGeneration();
	}

	static void testEmailAddressGeneration(){
		
		CredentialsManagerServiceImpl obj 
		= new CredentialsManagerServiceImpl();
	
		String emailAddress 
			= obj.generateEmailAddress("Harshit", "Chauhan", 4);
		
		System.out.println(emailAddress);
		
	}
}
