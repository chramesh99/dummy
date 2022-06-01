package com.test;

public class Student implements Comparable<Student> {

	private String name, city, state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.getName());
	}

}
