package com.test;

import java.util.ArrayList;

public class ForEachLoop {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		for(Integer a : al) {
			System.out.println(a);
		}
	}

}
