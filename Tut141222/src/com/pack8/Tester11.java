package com.pack8;

public abstract class Tester11 //The type Tester11 must be an abstract class to define abstract methods
{
	public abstract void test(); //This method requires a body instead of a semicolon 	

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		// Tester11 rv = new Tester11() //Cannot instantiate the type Tester11
		Tester11 rv; // Reference variable creation is possible 
		// new Tester11(); //Cannot instantiate the type Tester11
	}
}
