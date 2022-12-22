package com.tut2111;

public class Assi5_2111 {
	public static void modulus(int input1, int input2) {
		System.out.println("modulus begins");
		System.out.println("Modulus of " + input1 + " and " + input2 + " is " + (input1 % input2));
		System.out.println("modulus ends");
	}
	
	public static void modulus1(int input1, int input2) {
		System.out.println("modulus1 begins");
		int mod = input1 % input2;
		System.out.println("Modulus of " + input1 + " and " + input2 + " is " + mod);
		System.out.println("modulus1 ends");
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		modulus(4,2);
		modulus1(7,3);
		System.out.println("main ends");
	}
}
