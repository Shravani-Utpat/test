package com.tut2211;

public class Assi4_2211 {
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
	
	public static int modulus2(int input1, int input2) {
		int mod = input1 % input2;
		return mod;
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		modulus(4,2);
		modulus1(7,3);
		int mod = modulus2(12 , 6);
		System.out.println("Modulus of 12 and 6 is " + mod);
		System.out.println("Modulus of 66 and 6 is " + modulus2(11, 6));
		System.out.println("main ends");
	}
}
