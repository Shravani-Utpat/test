package com.tut1811;

public class Tut4_1811 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i = 0;
		if(i++ == 0  ||  i++ == 1)
		{
			System.out.println("from if " + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}
