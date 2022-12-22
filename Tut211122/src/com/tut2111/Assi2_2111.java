package com.tut2111;

public class Assi2_2111 {
	public static void sub(int input1, int input2) {
		System.out.println("sub begins");
		System.out.println("Sub of " + input1 + " and " + input2 + " is " + (input1 - input2));
		System.out.println("sub ends");
	}
	
	public static void sub1(int input1, int input2) {
		System.out.println("sub1 begins");
		int sub = input1 - input2;
		System.out.println("Sub of " + input1 + " and " + input2 + " is " + sub);
		System.out.println("sub1 ends");
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		sub(3,5);
		sub1(7,3);
		System.out.println("main ends");
	}
}
