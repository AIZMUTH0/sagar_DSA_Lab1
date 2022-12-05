package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.services.*;
public class Driver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String firstName = null;
		String lastName = null;

		/// Asking for credentials
		System.out.println("Welcome to login page");// System.out.println("Welcome to login page");
		System.out.println("Enter the first Name");
		firstName = scanner.nextLine();
		System.out.println("Enter the last Name");
		lastName = scanner.nextLine();
		
		
		
		
		// Creating object for employee
		Employee employee = new Employee(firstName, lastName);//parameterized constructor for passing values

		// Creating Credentials
		CredentailServices credentails = new CredentailServices();
		
		
		
		// ValidatingCredentials Structure - {if{do{switch}while}else{}}
		if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {

			int option;
			do {
				System.out.println("\n\n !!! Welcome to login page !!! n/n/");
				System.out.println("Enter the operation number that you want to perform");

				System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. HumanResource");
				System.out.println("4. Legal");
				// System.out.println("5. Logout");

				option = scanner.nextInt();

				String generatedEmail = null;
				String generatedPassword = null;

				switch (option) {

				case 0:
					option = 0;
					break;
				case 1: {
					generatedEmail = credentails.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "tech");
					generatedPassword = credentails.generatePassword();
				}
					break;
				case 2: {
					generatedEmail = credentails.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "adm");
					generatedPassword = credentails.generatePassword();
				}
					;
					break;
				case 3: {
					generatedEmail = credentails.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "hr");
					generatedPassword = credentails.generatePassword();
				}
					;
					break;
				case 4: {
					generatedEmail = credentails.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "lg");
					generatedPassword = credentails.generatePassword();
				}
					;
					break;
				// case 5 : break;
				default:
					System.out.println("please Enter a valid option");
					break;

				}

				employee.setEmail(generatedEmail);
				employee.setPassword(generatedPassword);
				credentails.showCredentials(employee);
				scanner.close();

			} while (option != 0);

		}

		else {
			System.out.println("Invalid Credentails");
		}

	}

}
