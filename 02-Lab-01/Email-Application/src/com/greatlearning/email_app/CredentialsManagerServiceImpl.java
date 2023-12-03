package com.greatlearning.email_app;

public class CredentialsManagerServiceImpl 
	implements ICredentialsManagerService {

//	@Override
	public String generateEmailAddress(
			String firstName, String lastName, int departmentCode) {
		
//		String emailAddress = "";
//		
//		emailAddress = emailAddress + firstName;
//		emailAddress = emailAddress + lastName;
		
		
		StringBuilder emailAddressBuilder =
			new StringBuilder();
		
		// lower case conversion
		emailAddressBuilder.append(firstName.toLowerCase());
		
		emailAddressBuilder.append(".");
		
		// lower case conversion 
		emailAddressBuilder.append(lastName.toLowerCase());
		
		emailAddressBuilder.append("@");
		
		String departmentName = "";
		
		if (departmentCode == 1) {
			departmentName = "tech";
		}else if (departmentCode == 2) {
			departmentName = "admin";
		}else if (departmentCode == 3) {
			departmentName = "hr";
		}else if (departmentCode == 4) {
			departmentName = "legal";
		}else {
			
			System.out.println("Incorrect department code value");
		}
		
		// TODO - Include @, departmentName, 'gl.com'
		
		emailAddressBuilder.append(departmentName);
		
		emailAddressBuilder.append(".");
		
		emailAddressBuilder.append("gl.com");
				
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
