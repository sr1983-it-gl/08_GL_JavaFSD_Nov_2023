package com.greatlearning.email_app;

public interface ICredentialsManagerService {

	String generateEmailAddress(
		String firstName, String lastName, 
		int departmentCode);

	String generatePassword();
	
	void displayGeneratedCredentials();

}
