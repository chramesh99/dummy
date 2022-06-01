package com.test;

import java.util.Arrays;
import java.util.Scanner;

class Test1 {
	public void convert() {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		System.out.println("Enter the name to insert");
		for(int i = 0 ; i < name.length; i++) {
			String nameString = sc.nextLine();
			name[i] = nameString;
		}
		Arrays.sort(name);
		for(int i = 0 ; i<name.length ; i++) {
			System.out.println(name[i]);
		}
		
		if(name.length % 2 == 0) {

			for(int i = 0 ; i<name.length/2 ; i++) {
				name[i] = name[i].toUpperCase();
			}
			System.out.println(Arrays.toString(name));
		}
		else {
			for(int i = 0 ; i < (name.length/2)+1 ; i++) {
				name[i] = name[i].toUpperCase();
			}
			System.out.println(Arrays.toString(name));
		}
	}
}
public class Test{
	public static void main(String[] args) {
		Test1 validateArray = new Test1();
		validateArray.convert();
	}
}
