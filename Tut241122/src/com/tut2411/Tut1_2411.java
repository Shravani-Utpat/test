package com.tut2411;

public class Tut1_2411 {

	static int i = 11; // global static variable, can be accessed using class name
	
	public static void main(String[] args) {
		System.out.println(Tut1_2411.i);
		Tut1_2411.i = 24;
		test();
		
	}
	
	public static void test() {
		System.out.println(Tut1_2411.i);
	}
}
