package com.project.exception;

import java.util.Scanner;

public class UserDefinedException 
{
	
	public static void validateCredentials() throws InvalidCredential {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=sc.next();
		System.out.println("Enter Password:");
		String password=sc.next();
		if(username.equals("KPMG") && password.equals("KPMG123"))
		{
			System.out.println("You're in!");
		}
		else
		{
			throw new InvalidCredential("Invalid username/password.. please try with valid credentials..");
		}
	}

	public static void main(String[] args) {
		
		try
		{
		UserDefinedException.validateCredentials();
		}
		catch (InvalidCredential ie)
		{
			System.out.println(ie);
		}
		finally
		{
			System.out.println("Finally block code");
		}
		System.out.println("Remaining code in main()");
	}

}
