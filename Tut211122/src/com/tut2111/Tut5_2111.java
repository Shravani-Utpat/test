package com.tut2111;

public class Tut5_2111 {
	public static void add(int input1, int input2) {
		System.out.println("add begins");
		System.out.println("Sum of " + input1 + " and " + input2 + " is " + (input1+input2));
		System.out.println("add ends");
	}
	
	public static void add1(int input1, int input2) {
		System.out.println("add1 begins");
		int sum = input1 + input2;
		System.out.println("Sum of " + input1 + " and " + input2 + " is " + sum);
		System.out.println("add1 ends");
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		add(3,5);
		add1(7,3);
		System.out.println("main ends");
	}
}
