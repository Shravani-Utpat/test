package com.tut2411;

public class Tut5_2411 {

	static String i = "Hello"; // global static variable, can be accessed using class name
	
	public static void main(String[] args) {
		System.out.println(Tut5_2411.i);
		Tut5_2411.i = "Hi";
		test();
		
	}
	
	public static void test() {
		System.out.println(Tut5_2411.i);
	}
}
