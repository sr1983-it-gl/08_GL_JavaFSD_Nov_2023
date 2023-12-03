package com.greatlearning.email_app;

public class Employee {

	String firstname;
	String lastname;
	String emailAddress;
	
	// String departmentName;
	
	
	public Employee(String firstname, String lastname, String emailAddress) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailAddress = emailAddress;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
