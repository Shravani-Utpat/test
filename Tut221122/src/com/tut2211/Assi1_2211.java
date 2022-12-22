package com.tut2211;

public class Assi1_2211 {

	public static void main(String[] args) {
		System.out.println("main begins");
		int table = table(5);
		System.out.println("main ends");
	}

	public static int table(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		return num;
	}
}