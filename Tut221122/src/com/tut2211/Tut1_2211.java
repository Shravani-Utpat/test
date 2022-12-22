package com.tut2211;

public class Tut1_2211 {

	public static void main(String[] args) {
		System.out.println("main Begins");
		checkevenodd(4);
		checkevenodd1(9);
		boolean iseven = checkevenodd2(12);
		System.out.println("12 is even ? -> " + iseven);
		System.out.println("main ends");
	}

	public static void checkevenodd(int input) {
		System.out.println("checkevenodd begins");
		if (input % 2 == 0) {
			System.out.println(input + " is a even number");
		} else {
			System.out.println(input + " is a odd number");
		}
		System.out.println("checkevenodd ends");
		return;
	}

	public static boolean checkevenodd1(int input) {
		System.out.println("checkevenodd1 begins");
		boolean flag = true;
		if (input % 2 == 0) {
			System.out.println(input + " is a even number");
			flag = true;
		} else {
			System.out.println(input + " is a odd number");
			flag = false;
		}
		System.out.println("checkevenodd1 ends");
		return flag;
	}
	
	public static boolean checkevenodd2(int input) {
		boolean flag = true;
		if (input % 2 == 0) {
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}
}
