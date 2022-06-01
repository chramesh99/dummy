package com.exception;

public class Main {
	
	public static void main(String[] args) {
		
		Exceptionhandling exceptionhandling = new Exceptionhandling();
		try {
			exceptionhandling.validate(20);
			exceptionhandling.validate(15);
		} catch (Exception e) {
			System.out.println("Custom" + e);
		}
		
	}

}
