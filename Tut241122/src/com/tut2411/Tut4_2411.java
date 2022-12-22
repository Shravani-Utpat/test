package com.tut2411;

public class Tut4_2411 {

	static char i = 'A'; // global static variable, can be accessed using class name
	
	public static void main(String[] args) {
		System.out.println(Tut4_2411.i);
		Tut4_2411.i = 'B';
		test();
		
	}
	
	public static void test() {
		System.out.println(Tut4_2411.i);
	}
}
