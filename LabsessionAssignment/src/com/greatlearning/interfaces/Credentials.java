package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

public interface Credentials {
	
	
	
public String generatePassword();
	
	public String generateEmailAddress(String firstName,String lastName,String depertment);
	
	public void showCredentials(Employee employee);
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
