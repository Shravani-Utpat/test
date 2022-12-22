package com.tut1811;

public class Tut14_1811 {
	public static void main(String[] args) {
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("loop begin:" + i);
			if(i >= 5)
			{
				System.out.println("from if:" + i);
				continue;//break// continue will not execute the remaining lines of for loop after continue
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end");
	}
}
