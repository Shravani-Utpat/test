package com.tut2411;

public class Tut7_2411 {

	int i = 11; // global non static variable, can be accessed using class name\
	// we should be creating object to access the non static members
	// General syntax for object creation
	// className referenceVariable = new className();
	
	public static void main(String[] args) {
		
		Tut7_2411 rv = new Tut7_2411();
		System.out.println(rv.i); //Cannot make a static reference to the non-static field Tut7_2411.i
		rv.i = 24;
		System.out.println(rv.i);
		rv.test();
		
	}
	
	public static void test() {
		Tut7_2411 rv = new Tut7_2411();
		System.out.println(rv.i);
	}
}
