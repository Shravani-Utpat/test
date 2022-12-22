package com.pack8;
abstract class A13
{
	void test()
	{
		System.out.println("From test() of A13");
	}
	abstract void test1();
	abstract void test2();
	
}
abstract class B13 extends A13
{
	void test1()
	{
		System.out.println("From test1() of B13");
	}
}
class C13 extends B13
{
	void test2()
	{
		System.out.println("From test2() of C13");
	}
}
public class Tester13 
{
	public static void main(String[] args) 
	{
		A13 rv;
		//A13 rv1 = new A13();
		//new B13();
		new C13();
		C13 crv = new C13();
		crv.test();
		crv.test1();
		crv.test2();
		System.out.println("Hello World!");
	}
}
