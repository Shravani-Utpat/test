package com.tut2411;

public class Tut3_2411 {

	static double i = 24.11; // global static variable, can be accessed using class name
	
	public static void main(String[] args) {
		System.out.println(Tut3_2411.i);
		Tut3_2411.i = 25.11;
		test();
		
	}
	
	public static void test() {
		System.out.println(Tut3_2411.i);
	}
}
