package com.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FirstTest {

	public static void main(String[] args) {
		
		double x = Math.PI;
		System.out.println("PI: "+x);
		
		List<Student> students = new LinkedList<>();
		students.add(new Student("suresh", "bangalore", "Karnataka"));
		students.add(new Student("akshay", "bangalore", "Karnataka"));
		students.add(new Student("yash", "bangalore", "Karnataka"));
		students.add(new Student("yuvraj", "bangalore", "Karnataka"));
		students.add(new Student("san", "bangalore", "Karnataka"));
		
		
		Collections.sort(students);
		
		students.stream().forEach(a -> System.out.println(a));
		
		String str = "asdad";
		
		
		
		
	}
	
}
