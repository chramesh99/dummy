package com.test;

public class Exceptions {
	public static void main(String[] args) {
		TestTest test = new TestTest();
		test.add();
	}
}

class TestTest {
	public void add() {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("in add method");
	}
}