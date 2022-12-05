package com.greatlearning.services;

import com.greatlearning.interfaces.*;
import com.greatlearning.model.*;
import com.greatlearning.services.*;

import java.util.Random;
import java.util.random.*;
public class CredentailServices implements Credentials {

	
//_/\_service_class_holding_logic 	
	
	
	
	
	
	
	//password
	public String generatePassword() {

		String number = "1234567890";
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String smallLetter = "abcdefghijklmnpqrstuvwxyz";
		String specialCharacter = "&$@";

		String values = specialCharacter + capitalLetter + smallLetter + number;
		// System.out.println(values);
		Random random = new Random();

		String password = "";

		char temp;
		for (int i = 0; i < 8; i++) {
			// Use of charAt()method :to get character value
			// Use of nextInt as it scanning the value as int

//		   Approach 1
			password += String.valueOf(values.charAt(random.nextInt(values.length())));

//	   Approach 2
//	   temp = (char)(random.nextInt(126-33)+33);
//	   password +=temp;

		}

		return password;

	}
    
	//email
	public String generateEmailAddress(String firstName, String lastName, String department) {

		return  firstName + lastName + "@" + department + ".gl.in";

	}
    
	//
	public void showCredentials(Employee employee) {

		System.out.println("Dear  " + " "+ employee.getFirstName()+" " + "your generated credentails are as follow");
		System.out.println("Email\t\t" + employee.getEmail());
		System.out.println("Password\t" + employee.getPassword());

	}

}
