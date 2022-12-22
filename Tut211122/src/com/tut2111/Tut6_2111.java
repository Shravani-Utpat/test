package com.tut2111;

public class Tut6_2111 {

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
		
	}

	public static void main(String[] args) {
		System.out.println("main begins");
		isprime(4);
		System.out.println("main ends");
		
	}
}
