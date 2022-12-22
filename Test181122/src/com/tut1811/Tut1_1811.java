package com.tut1811;

public class Tut1_1811 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = 10;
		if(++i == 11)
		{
			System.out.println("from if");
			System.out.println("from if");
			i++;
		}
		System.out.println("main end:" + i);
	}
}
