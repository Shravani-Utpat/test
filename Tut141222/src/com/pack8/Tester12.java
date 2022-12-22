package com.pack8;

abstract class A
{
	void test()
	{
		System.out.println("From test of A");
	}
	abstract void test1();
	abstract void test2();
	
}
abstract class B extends A //The type B must implement the inherited abstract method A.test2()
{
	void test1()
	{
		System.out.println("This is from test1");
	}
}

class B1 extends A{ //The type B1 must implement the inherited abstract method A.test2()
	 				//The type B1 must implement the inherited abstract method A.test1()
	void test1()
	{
		System.out.println("This is from test1");
	}
	void test2()
	{
		System.out.println("This is from test2");
	}
}
public class Tester12 
{
	public static void main(String[] args) 
	{
		A rv;
		//A rv1 = new A();
		System.out.println("Hello World!");
		B1 brv = new B1();	
		brv.test();
		brv.test1();
		brv.test2();
	}
}
