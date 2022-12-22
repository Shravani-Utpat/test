package com.tut2111;

public class Assi4_2111 {
	public static void division(int input1, int input2) {
		System.out.println("division begins");
		System.out.println("Division of " + input1 + " and " + input2 + " is " + (input1 / input2));
		System.out.println("division ends");
	}
	
	public static void division1(int input1, int input2) {
		System.out.println("division1 begins");
		int div = input1 / input2;
		System.out.println("Division of " + input1 + " and " + input2 + " is " + div);
		System.out.println("division1 ends");
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		division(4,2);
		division1(7,3);
		System.out.println("main ends");
	}
}
