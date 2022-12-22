package com.tut2211;

public class Tut2_2211 {

	public static void add(int input1, int input2) {
		System.out.println("add begins");
		System.out.println("Sum of " + input1 + " and " + input2 + " is " + (input1 + input2));
		System.out.println("add ends");
	}

	public static void add1(int input1, int input2) {
		System.out.println("add1 begins");
		int sum = input1 + input2;
		System.out.println("Sum of " + input1 + " and " + input2 + " is " + sum);
		System.out.println("add1 ends");
	}
	
	public static int add2(int input1, int input2) {
		int sum = input1 + input2;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main begins");
		add(3, 5);
		add1(7, 3);
		int sum = add2(4, 3);
		System.out.println("Sum of 4 and 3 is " + sum);
		System.out.println("Sum of 2 and 4 is " + add2(2, 4));
		System.out.println("main ends");
	}
}
