package com.greatlearning.email_app;

public interface ICredentialsManagerService {

	String generateEmailAddress(String firstName, String lastName);

	String generatePassword();
	
	void displayGeneratedCredentials();

}
