package com.tut2211;

public class Tut4_2211 {
	public static void isprime(int input) {
		System.out.println("isprime begins");
		boolean flag = true;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println(input + " is a prime");
		else
			System.out.println(input + " is not a prime");

		System.out.println("isprime ends");
	}

	public static boolean isprime1(int input) {
		boolean flag = true;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("main begins");
		isprime(4);
		boolean checkprime = isprime1(2);
		System.out.println("2 is prime ? -> " + checkprime);
		System.out.println("13 is prime ? -> " + isprime1(13));
		System.out.println("main ends");

	}
	
}
