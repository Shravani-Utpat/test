package com.tut2411;

public class Tut2_2411 {

	static boolean i = false; // global static variable, can be accessed using class name
	
	public static void main(String[] args) {
		System.out.println(Tut2_2411.i);
		Tut2_2411.i = true;
		test();
		
	}
	
	public static void test() {
		System.out.println(Tut2_2411.i);
	}
}
