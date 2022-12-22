package com.tut1811;

public class Tut13_1811 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("init:" + i);  
			i <= 5; 
			i++, System.out.println("change:" + i))
		{
			System.out.println("loop:" + i);
		}
		System.out.println("main end:" + i);
	}
}
