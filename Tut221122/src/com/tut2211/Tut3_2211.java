package com.tut2211;

public class Tut3_2211 {
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
	
	public static int sub2(int input1, int input2) {
		int sub = input1 - input2;
		return sub;
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		sub(3,5);
		sub1(7,3);
		int sub = sub2(12 , 6);
		System.out.println("Sub of 12 and 6 is " + sub);
		System.out.println("Sub of 11 and 6 is " + sub2(11, 6));
		System.out.println("main ends");
	}
}
