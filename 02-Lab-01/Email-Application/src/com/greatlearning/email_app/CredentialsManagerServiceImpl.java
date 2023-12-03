package com.greatlearning.email_app;

public class CredentialsManagerServiceImpl 
	implements ICredentialsManagerService {

	@Override
	public String generateEmailAddress(
			String firstName, String lastName, int departmentCode) {
				
		StringBuilder emailAddressBuilder =
			new StringBuilder();
		
		emailAddressBuilder.append(firstName);
		emailAddressBuilder.append(".");
		emailAddressBuilder.append(lastName);
		
		// TODO - Include @, departmentName, 'gl.com'
		
		// Department name from department code		
			// Use of if-else
			// switch case
		
		return emailAddressBuilder.toString();
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayGeneratedCredentials() {
		// TODO Auto-generated method stub
		
	}

}
