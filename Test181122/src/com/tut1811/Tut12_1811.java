package com.tut1811;

public class Tut12_1811 {
	public static void main(String[] args) {
		System.out.println("main begin");
		for(int i = 1, j = 10; i <= 5 && j >= 8; i++, j--)
		{
			System.out.println("loop: " + i + ", " + j);
		}
		System.out.println("main end:");
	}
}
