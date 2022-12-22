package com.tut1811;

public class Tut2_1811 {
	public static void main(String[] args) {
		System.out.println("main begin");
		boolean b1 = false, b2 = true;
		if(b1 || b2)
		{
			System.out.println("from if");
			System.out.println("from if");
		}
		System.out.println("main end:");
	}
}
/*
or
-----
true || true = true
false || true = true
true || false = true
false || false = false
*/