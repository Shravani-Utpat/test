package com.tut2211;

public class Assi2_2211 {
	public static void multiplication(int input1, int input2) {
		System.out.println("multiplication begins");
		System.out.println("Multiplication of " + input1 + " and " + input2 + " is " + (input1 * input2));
		System.out.println("multiplication ends");
	}
	
	public static void multiplication1(int input1, int input2) {
		System.out.println("multiplication1 begins");
		int multi = input1 * input2;
		System.out.println("Multiplication of " + input1 + " and " + input2 + " is " + multi);
		System.out.println("multiplication1 ends");
	}
	
	public static int multiplication2(int input1, int input2) {
		int multi = input1 * input2;
		return multi;
	}
	
	public static void main(String[] args) {
		System.out.println("main begins");
		multiplication(3,5);
		multiplication1(7,3);
		int multi = multiplication2(12 , 6);
		System.out.println("Multiplication of 12 and 6 is " + multi);
		System.out.println("Multiplication of 11 and 6 is " + multiplication2(11, 6));
		System.out.println("main ends");
	}
}
