package com.exception;

public class Exceptionhandling {
	
	public void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("age is valid....");
		}
	}

}
