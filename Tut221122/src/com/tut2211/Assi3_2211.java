package com.tut2211;

public class Assi3_2211 {
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
	
	public static int division2(int input1, int input2) {
		int div = input1 / input2;
		return div;
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		division(4,2);
		division1(7,3);
		int div = division2(12 , 6);
		System.out.println("Division of 12 and 6 is " + div);
		System.out.println("Division of 66 and 6 is " + division2(11, 6));
		System.out.println("main ends");
	}
}
